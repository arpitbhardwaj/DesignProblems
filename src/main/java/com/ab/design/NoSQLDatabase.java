package com.ab.design;

/**
 * @author Arpit Bhardwaj
 *
 * NoSQL (Not only SQL) Databases
 *      developed on "BASE" Principles
 *      Basic Availability:     Guarantees the availability of the data . There will be a response to any request
 *      Soft State:             The state of the system could change over time.
 *      Eventually Consistency: The system will eventually become consistent.
 *
 * Types of NoSQL Databases.
 *      Key-Value           -   Amazon S3/Redis
 *      Column Based        -   Cassandra/HBase   -   Provides AP from CAP Theorem    -   implemented using java
 *      Document Based      -   MongoDB           -   Provides CP from CAP Theorem    -   implemented using c++
 *      Graph Based         -   Neo4J
 *
 *
 * Cassandra vs HBase
 *  Cassandra has no spof though HBase has
 *  Cassandra is preffered for real time very fast lookups
 *  HBase is mostly preferred for heavy etl batch jobs with lower latency requirements.
 *
 */