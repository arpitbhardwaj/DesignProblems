package com.ab.design;

/**
 * @author Arpit Bhardwaj
 *
 * Monolithic
 * Service oriented architecture (SOA)
 * Microservice
 * CloudNative
 *      A container-based infrastructure
 *      An architecture built around microservices
 *      Use of continuous integration and continuous delivery (CI/CD)
 * Serverless
 *      is an arrangement where the enterprise hosts its software on a third-party FaaS (Function as a service) platform such as AWS Lambda
 *      here key is the software(function) is deployed with trigger condition, and when it met only then function runs on server.
 *      servers do exist in a serverless implementation. It’s just that the enterprise itself doesn’t own or run the servers themselves
 *      For ex. status update notification to friends
 *          when a person updates the status(trigger condition) the it run a function on AWS lambda to send notication to friend list.
 *
 * Disadvantages of Monolithic Application
 *      very large and complex to understand.
 *      larger the application, the longer the start‑up time is.
 *      is an obstacle to CI/CD
 *      difficult to scale
 *      compromise on the choice of hardware
 *      a bug in any module, such as a memory leak, can potentially bring down the entire process.
 *      difficult to adopt new frameworks and languages
 *
 * Disadvantages of Microservice Application
 *      due to multiple microservices
 *          need to implement an inter‑process communication (IPC) mechanism based on either messaging or RPC.
 *          need to handle partial failure since the destination of a request might be slow or unavailable.
 *          testing is also much more complex
 *      due to partitioned database
 *          need to update multiple databases owned by different services.
 *               manage distributed transactions approach is usually not an option here
 *               you need to choose an eventual consistency based approach here (SAGA Pattern)
 *
 */