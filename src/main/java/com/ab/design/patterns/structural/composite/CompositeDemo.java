package com.ab.design.patterns.structural.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Arpit Bhardwaj
 *
 * Composite pattern is a partitioning design pattern and describes a group of objects that is treated the same way as a single instance of the same type of object.
 *
 * The Composite Pattern has four participants:
 *
 * Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
 * Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
 * Composite – Composite stores' child components and implements child related operations in the component interface.
 * Client – Client manipulates the objects in the composition through the component interface.
 */

public class CompositeDemo {
    public static void main(String[] args) {
        Map<String,String> personAttributes = new HashMap<>();
        personAttributes.put("site_role","person");
        personAttributes.put("access_role", "limited");

        Map<String,String> groupAttributes = new HashMap<>();
        groupAttributes.put("group_role","claims");

        Map<String,String> secAttributes = new HashMap<>();

        secAttributes.putAll(personAttributes);
        secAttributes.putAll(groupAttributes);

        System.out.println(secAttributes);
    }
}
