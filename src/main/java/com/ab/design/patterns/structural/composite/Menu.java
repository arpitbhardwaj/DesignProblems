package com.ab.design.patterns.structural.composite;

import java.util.Iterator;
/**
 * @author Arpit Bhardwaj
 *
 * Composite – Composite stores' child components and implements child related operations in the component interface.
 */
public class Menu extends MenuComponent {

    public Menu(String name,String url) {
        this.name = name;
        this.url = url;
    }

    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    public MenuComponent remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));

        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            builder.append(menuComponent.toString());
        }
        return builder.toString();
    }
}
