package com.ab.design.structuralpatterns.decorator;

import java.io.*;

/**
 * @author Arpit Bhardwaj
 *
 * Allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.
 *
 * Often useful for adhering to the Single Responsibility Principle.
 * The decorator pattern is structurally nearly identical to the chain of responsibility (COR) pattern,
 * the difference being that in COR, exactly one of the classes handles the request at runtime
 * while for the decorator, all classes handle the request at runtime.
 *
 * Decorator solve below problems:
 *      Responsibilities should be added to (and removed from) an object dynamically at run-time.
 *      A flexible alternative to subclassing for extending functionality should be provided.
 */
public class DecoratorDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt");
        file.createNewFile();

        OutputStream outputStream = new FileOutputStream(file);
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        dataOutputStream.writeChars("text");
        dataOutputStream.close();
        outputStream.close();

    }
}
