package com.ab.design.creationalpatterns.singleton;

/**
 * @author Arpit Bhardwaj
 *
 */
public class SingletonDemo {
    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println(anotherInstance);

        if(singletonRuntime == anotherInstance){
            System.out.println("both are same");
        }
    }
}
