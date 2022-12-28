package com.ab.design;

/**
 * @author Arpit Bhardwaj
 *
 * Relational Databases
 *      developed on "ACID" Principles
 *      Atomicity:    Each database transaction is a single unit that adopts an "all or nothing" approach to execution.
 *      Consistency:  If any element of an atomic transaction would disrupt the consistency(business rule) of the database, the entire transaction fails.
 *      Isolation:    the execution of transactions concurrently will result in a state that is equivalent to a state achieved these were executed serially in some order.
 *      Durability:   once a transaction is committed to the database, it is permanently preserved through the use of backups and transaction logs.
 *
 * SQL Commands are categorized into 5 categories:
 *      DDL – Data Definition Language
 *          Create,Drop,Alter,Truncate
 *      DQl – Data Query Language
 *          Select
 *      DML – Data Manipulation Language
 *          Insert, Update,Delete,Call,Explain Call,Lock
 *      TCL - Transaction Control Language
 *          Set Transaction,Savepoint,Commit,Rollback,Set Constraint
 *      DCL – Data Control Language
 *          Grant,Revoke
 *
 * Important Notes:
 *      DDL commands are auto commit, hence cannnot be rollback
 *
 * Diff between DROP, TRUNCATE, DELETE
 *      DROP
 *          DDL Command, hence cannot be rolledback
 *          used to drop the whole table structure
 *      TRUNCATE
 *          DDL Command, hence cannot be rolledback
 *          used to delete all the rows of a table in one go
 *          comparativeily faster than DELETE.
 *      DELETE
 *          DML Command, can be rolledback
 *          used to delete one, multiple, or all the rows of a table.
 *
 * Transaction states
 *      Active
 *      Partially Commited
 *      Failed
 *      Commited
 *      Aborted
 *
 * Types of Transaction
 *      Flat and Nested Transaction
 *      Distributed and Non-Distributed Transaction
 *
 */