package com.ab.design;

/**
 * @author Arpit Bhardwaj
 *
 * HTTP is standard with well-defined constraints
 *      HTTP exibhits many features of Restfull system
 * SOAP (Simple Object Access Protocol)
 *
 * REST (Representational State Transfer)
 *      REST is any interface between systems using HTTP to obtain data and generate operations on those data in all possible formats, such as XML and JSON.
 *      Features:
 *          Stateless
 *          Uniform interface
 *          Layer system
 *          Use of hypermedia
 *      Advantages
 *          Separation between the client and the server
 *          Visibility, reliability and scalability
 *          The REST API is always independent of the type of platform or languages
 *
 *
 * Idempotent:
 *      An idempotent HTTP method is an HTTP method that can be called multiple times without different outcomes.
 *      Idempotency is important in building a fault-tolerant API.
 *      Idempotent HTTP Methods
 *          OPTIONS, GET, HEAD, PUT, DELETE
 *      Non-idempotent Methods
 *          POST, PATCH
 *      https://medium.com/@saurav200892/how-to-achieve-idempotency-in-post-method-d88d7b08fcdd
 *      Make POST request idempotent using Idempotency-key
 *
 */