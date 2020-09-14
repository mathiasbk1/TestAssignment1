package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CelsiusToFahrTest {

    @Test
    public void objectOfClassMustNotBeNull() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        assertNotNull(ctf);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIsZero() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 0;
        double expected = 32;
        double result = ctf.celsiusToFahrenheit(input);
        assertTrue(expected == result);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIs1() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 1;
        double expected = 33.8;
        double result = ctf.celsiusToFahrenheit(input);
        assertTrue(expected == result);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIs50() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 50;
        double expected = 122;
        double result = ctf.celsiusToFahrenheit(input);
        assertTrue(expected == result);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIs100() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 100;
        double expected = 212;
        double result = ctf.celsiusToFahrenheit(input);
        assertTrue(expected == result);
    }

}
