package com.ab.design.algorithm;

/**
 * @author Arpit Bhardwaj
 *
 * BitMap is a array of bits
 *  BM = 10010011 (cosuming 1 byte)
 *  Hence to store information for 1 billion users 1billion/8 = 125 MB
 *
 * Used Case: (System having 1 billion users)
 *      Calculate no of active user and inactive user in a day
 *          count 0 for inactive and 1 for active
 *      Calculate no of active user in last n days
 *          Save bitmap of that many days in memory and do AND operation on that
 *      Calculate no of windows user or IOS users
 *          Save bitmap for those divices and count 1s
 */