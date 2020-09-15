package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class CelsiusToFahrenheit {

    static String input;
    static double number;

/*    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }*/

    public static double celsiusToFahrenheit(double number) {
        return (number * 1.8) + 32;
    }

    public static double fahrenheitToCelsius(double number) {
        return (number - 32) / 1.8;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter a number followed by a blank space, and C or F for conversion from Celsius or Fahrenheit");
        System.out.println("ex: \"45.6 F\" for converting 45.6 degrees fahrenheit to celsius\n");

        while ((input = s.nextLine()) != null) {
            if (input.equalsIgnoreCase("stop")) break;

            String[] split = input.split(" ");
            if (split.length != 2) {
                System.out.println("Wrong number of arguments. Write a number followed by either 'f' or 'c', separated by whitespace" + "\n");
                continue;
            }

            try {
                number = Double.valueOf(split[0]);
            } catch (Exception e) {
                System.out.println("First input not a number" + "\n");
                continue;
            }

            String action = split[1];

            if (action.equalsIgnoreCase("f")) {
                System.out.println("Result in celsius: " + fahrenheitToCelsius(number) + "\n");
            } else if (action.equalsIgnoreCase("c")) {
                System.out.println("Result in fahrenheit: " + celsiusToFahrenheit(number) + "\n");
            } else {
                System.out.println("Second input needs to be either \"f\" or \"c\" (case ignored)" + "\n");
                continue;
            }
        }
    }
}
