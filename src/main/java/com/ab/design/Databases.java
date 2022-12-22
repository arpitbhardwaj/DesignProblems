package com.ab.design;

/**
 * @author Arpit Bhardwaj
 *
 * Relational Databases
 *      developed on ACID Principles
 *      Atomicity:    Each database transaction is a single unit that adopts an "all or nothing" approach to execution.
 *      Consistency:  If any element of an atomic transaction would disrupt the consistency(business rule) of the database, the entire transaction fails.
 *      Isolation:    the execution of transactions concurrently will result in a state that is equivalent to a state achieved these were executed serially in some order.
 *      Durability:   once a transaction is committed to the database, it is permanently preserved through the use of backups and transaction logs.
 *
 * NoSQL (Not only SQL) Databases
 *      developed on BASE Principles
 *      Basic Availability:     Guarantees the availability of the data . There will be a response to any request
 *      Soft State:             The state of the system could change over time.
 *      Eventually Consistency: The system will eventually become consistent once it stops receiving input.
 *
 * Types of NoSQL Databases.
 *      Key-Value           -   Amazon S3
 *      Column Based        -   Cassandra   -   Provides AP from CAP Theorem    -   implemented using java
 *      Document Based      -   MongoDB     -   Provides CP from CAP Theorem    -   implemented using c++
 *      Graph Based         -   Neo4J
 */