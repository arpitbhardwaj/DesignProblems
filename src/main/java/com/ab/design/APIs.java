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
 *
 * Status Codes
 *      1xx: Informational  – Communicates transfer protocol-level information.
 *      2xx: Success        – client’s request was accepted successfully.
 *          200 OK
 *          201 CREATED
 *          204 NO CONTENT
 *      3xx: Redirection    – client must take some additional action in order to complete their request.
 *      4xx: Client Error   – client takes responsibility for these error status codes.
 *          400 BAD REQUEST
 *          401 UNAUTHORIZED
 *          403 FORBIDDEN
 *          404 NOT FOUND
 *          405 METHOD NOT ALLOWED
 *      5xx: Server Error   – server takes responsibility for these error status codes.
 *          500 INTERNAL SERVER ERROR
 */