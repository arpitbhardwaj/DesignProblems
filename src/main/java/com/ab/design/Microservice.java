package com.ab.design;

/**
 * @author Arpit Bhardwaj
 *
 * Microservice
 *      API Gateway
 *          is a server that is the single entry point into the system.
 *          uses facade pattern
 *          encapsulates the internal system architecture and provides an API that is tailored to each client.
 *          also handles authentication, monitoring, load balancing, caching, request shaping and management, and static response handling.
 *      IPC (Inter process communication)
 *          	                One-to-One	                    One-to-Many
 *              Synchronous	    Request/response	            —
 *              Asynchronous	Notification	                Publish/subscribe
 *                              Request/async response	        Publish/async responses
 *       Service Discovery
 *          Client-Side Service Discovery Pattern (Netflix OSS and Netflix Eureka)
 *              client queries a service registry, which is a database of available service instances
 *              to determin the network locations of available service instances and load balancing requests across them.
 *          Server-Side Service Discovery Pattern (AWS Elastic Load Balancer)
 *              client makes a request to a service via a load balancer.
 *              load balancer queries the service registry and routes each request to an available service instance.
 *       Distributed data management
 *          2PC Commit
 *          3PC Commit
 *          SAGA Pattern (Event Driven Pattern)
 *       Distributed Tracing
 *          Splunk
 */