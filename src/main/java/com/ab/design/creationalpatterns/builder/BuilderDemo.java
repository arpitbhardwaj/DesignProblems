package com.ab.design.creationalpatterns.builder;

/**
 * @author Arpit Bhardwaj
 * Builder pattern helps us in creating immutable classes with large set of state attributes.
 *
 * difference between builder and abstract factory pattern is that,
 * builder provides you more control over the object creation process and that’s it.
 *
 * StringBuilder and Build Pattern are not same, instead the String Builder append method uses kinde of builder functionality implicitlt
 * StringBuilder class can be used when you want to modify a string without creating a new object.
 * Hence Stringbuilder instance are immutable
 */
public class BuilderDemo {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("This is an example");
        builder.append(" of builder pattern");
        builder.append("it has methods to append");
        builder.append(" almost anything we want to string ");
        builder.append(42);
        System.out.println(builder.toString());
    }
}
