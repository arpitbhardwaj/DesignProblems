package com.ab.design.algorithm.leakybucket;

/**
 * @author Arpit Bhardwaj
 *
 * Leaky bucket (closely related to token bucket) is an algorithm that provides
 *      a simple, intuitive approach to rate limiting via a queue, which you can think of as a bucket holding the requests.
 *      When registering a request, the system appends it to the end of the queue.
 *      Processing for the first item on the queue occurs at a regular interval or first in, first out (FIFO).
 *      If the queue is full, then additional requests are discarded (or leaked).
 *
 * Used Case:
 *      To design rate limitters
 */