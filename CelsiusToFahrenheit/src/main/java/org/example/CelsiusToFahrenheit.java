package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class CelsiusToFahrenheit {

    static String input;
    static double number;


    public static double celsiusToFahrenheit(double number) {
        return (number * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double number) {
        return (number - 32) / 1.8;
    }


    public static void main(String[] args) {
        System.out.printf("Hello World");

    }
}
