package com.ab.design.structuralpatterns.facade;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author Arpit Bhardwaj
 *
 * A facade is an object that serves as a front-facing interface masking more complex underlying or structural code.
 * Facade design pattern solve:
 *      To make a complex subsystem easier to use, a simple interface should be provided for a set of interfaces in the subsystem.
 *      The dependencies on a subsystem should be minimized.
 */

public class FacadeDemo {
    public static void main(String[] args) throws IOException {
        //URL url = new URL("http","www.pluralsight.com",80,"/author/bryan-hansen");
        URL url = new URL("https://app.pluralsight.com/profile/author/bryan-hansen");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null){
            System.out.println(inputLine);
        }
    }
}
