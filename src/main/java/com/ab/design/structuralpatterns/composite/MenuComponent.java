package com.ab.design.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;
/**
 * @author Arpit Bhardwaj
 *
 * Component – Component declares the interface for objects in the composition and for accessing and managing its child components. It also implements default behavior for the interface common to all classes as appropriate.
 */
public abstract class MenuComponent {

    String name;
    String url;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public abstract String toString();

    //default behaviour common to all inheriting classes
    String print(MenuComponent menuComponent){
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        builder.append(" : ");
        builder.append(url);
        builder.append("\n");
        return builder.toString();
    }
}
