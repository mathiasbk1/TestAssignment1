package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class RomanNumerals {

/*    String toRoman(int num) {
        String s = "";

        while (num >= 1000) {
            s += "M";
            num -= 1000;        }
        while (num >= 900) {
            s += "CM";
            num -= 900;
        }
        while (num >= 500) {
            s += "D";
            num -= 500;
        }
        while (num >= 400) {
            s += "CD";
            num -= 400;
        }
        while (num >= 100) {
            s += "C";
            num -= 100;
        }
        while (num >= 90) {
            s += "XC";
            num -= 90;
        }
        while (num >= 50) {
            s += "L";
            num -= 50;
        }
        while (num >= 40) {
            s += "XL";
            num -= 40;
        }
        while (num >= 40) {
            s += "X";
            num -= 10;
        }while (num >= 10) {
            s += "X";
            num -= 10;
        }while (num >= 9) {
            s += "IX";
            num -= 9;
        }while (num >= 5) {
            s += "V";
            num -= 5;
        }
        while (num >= 4) {
            s += "IV";
            num -= 4;
        }
        while (num > 0) {
            s += "I";
            num -= 1;
        }
        return s;
    }*/
    // Fandt en mere elegant løsning på Stackoverflow :))
    public static String toRoman(int i) {
        LinkedHashMap<String, Integer> roman_numerals = new LinkedHashMap<String, Integer>();
        roman_numerals.put("M", 1000);
        roman_numerals.put("CM", 900);
        roman_numerals.put("D", 500);
        roman_numerals.put("CD", 400);
        roman_numerals.put("C", 100);
        roman_numerals.put("XC", 90);
        roman_numerals.put("L", 50);
        roman_numerals.put("XL", 40);
        roman_numerals.put("X", 10);
        roman_numerals.put("IX", 9);
        roman_numerals.put("V", 5);
        roman_numerals.put("IV", 4);
        roman_numerals.put("I", 1);
        String res = "";
        for (Map.Entry<String, Integer> entry : roman_numerals.entrySet()) {
            int matches = i / entry.getValue();
            res += repeat(entry.getKey(), matches);
            i = i % entry.getValue();
        }
        return res;
    }

    public static String repeat(String s, int n) {
        if (s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
