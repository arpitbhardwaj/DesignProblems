package com.ab.design.patterns.structural.bridge;

public class PrinterBridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("War");
        movie.setRuntime("2:30");
        movie.setYear("2019");

        Formatter basicFormatter = new BasicFormatter();
        //Bridge between different types of formatter and Movie to print
        MoviePrinter moviePrinter = new MoviePrinter(movie);

        System.out.println(moviePrinter.print(basicFormatter));

        Formatter htmlFormatter = new HtmlFormatter();
        System.out.println(moviePrinter.print(htmlFormatter));
    }
}
