package com.ab.design.machine.elevator;

/**
 * @author Arpit Bhardwaj
 *
 * State : Up, Down, Idle
 * Transfer passenger form one floor to another
 * Open Door only when its idle
 * 200 Floors - 50 Elevators Cars
 *
 * Specs of Elevator Cars
 *      No of Passengers
 *      Maximum Load
 *      Max Speed
 * Minimize
 *      wait time of system/passenger
 *      minimze power consume
 * Maximize
 *      transfer throughput
 * Actors
 *      Passenger, Elevator Car, Floors, Doors, Button Panels (outside and inside elevator car)
 *      Dispatcher, Elevator System, Monitoring System
 *
 * Dispatcher Algorithm
 *      1.FCFS (First come first served) - using queue
 *      2.SSTF (Shortest seek time first) - using priority queue (starvation issue)
 *          insert all the request in pq based on distance between requesting floor and destination floor
 *      3.SCAN (Elevator Algorithm) (elevator keep on moving which is the issue)
 *          2 boolean arrays one for up and one for down
 *          2 Priority queues for minimum seek time
 *      4.LOOK (Elevator stops if there are no more ahead requests)
 *      5.Destination Dipatch (trying to load the passengers in same elevator who are going in same direction)
 *
 * No Passenger class as it is Elevator control system not a simulation system
 */
public class ElevatorCar {
    public boolean isUnderMaintenance() {
        return false;
    }
    public int currentFloor() {
        return 0;
    }

    public void openDoor() {}
    public void closeDoor() {}

    public boolean isDoorOpen() {
        return false;
    }
    public boolean isDoorClosed() {
        return false;
    }

    public void goElevatorCarUp(int floor) {}
    public void goElevatorCarDown(int floor) {}
}
