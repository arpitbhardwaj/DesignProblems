package com.ab.design.structuralpatterns.composite;

/**
 * @author Arpit Bhardwaj
 *
 * Leaf – Leaf defines behavior for primitive objects in the composition. It represents leaf objects in the composition.
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name,String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
