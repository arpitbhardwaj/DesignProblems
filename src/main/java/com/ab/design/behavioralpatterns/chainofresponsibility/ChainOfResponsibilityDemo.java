package com.ab.design.behavioralpatterns.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Arpit Bhardwaj
 *
 * the chain of responsibility is an object oriented version of the if ... else if ....... else ... endif idiom
 * it consisting of a source of command objects and a series of processing objects.
 */

public class ChainOfResponsibilityDemo {
    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityDemo.class.getName());
    public static void main(String[] args) {
        logger.setLevel(Level.FINER);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER);

        logger.addHandler(consoleHandler);

        logger.fine("this is fine");
        logger.finer("this is finer");
        logger.finest("this is finest");
    }
}
