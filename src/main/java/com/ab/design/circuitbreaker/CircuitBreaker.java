package com.ab.design.circuitbreaker;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Arpit Bhardwaj
 */
public class CircuitBreaker {

    private State state;
    // Number of failures we receive from the dependent service before we change the state to 'OPEN'
    private int failureThreshold;
    // Timeout for the API request.
    private int timeout;
    // Time period after which a fresh request be made to the dependent service to check if service is up, once the circuit is in OPEN state.
    private Duration retryTimePeriod;

    private LocalTime lastFailureTime;
    private int failureCount;

    public CircuitBreaker(int timeout,int failureThreshold,Duration retryTimePeriod) {
        this.state = State.CLOSED;
        this.failureThreshold = failureThreshold;
        this.timeout = timeout;
        this.retryTimePeriod = retryTimePeriod;
        this.lastFailureTime = null;
        this.failureCount = 0;
    }

    public void setState() {
        if (this.failureCount > this.failureThreshold) {
            if (Duration.between(LocalTime.now(),this.lastFailureTime).compareTo(this.retryTimePeriod) > 0) {
                this.state = State.HALF_OPEN;
            } else {
                this.state = State.OPEN;
            }
        } else {
            this.state = State.CLOSED;
        }
    }

    public void  recordFailure() {
        this.failureCount += 1;
        this.lastFailureTime = LocalTime.now();
    }

    public void reset() {
        this.failureCount = 0;
        this.lastFailureTime = null;
        this.state = State.CLOSED;
    }

    public String call(Service serv) throws IOException {
        // Determine the current state of the circuit.
        this.setState();
        switch (this.state) {
            // return cached response if circuit is in OPEN state
            case OPEN:
                return null;
            // Make the API request if the circuit is not OPEN
            case HALF_OPEN:
            case CLOSED:
                try {
                    //call the service
                    String response = serv.call();
                    //the API responded fine. Let's reset everything.
                    this.reset();
                    return response;
                } catch (Exception e) {
                    // the call still failed. Let's update that in our records.
                    this.recordFailure();
                    throw e;
                }
            //This state should never be reached unexpected state in the state machine
            default:
                return null;
        }
    }
}
