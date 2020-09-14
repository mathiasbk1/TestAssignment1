package org.example;

import org.example.CelsiusToFahrenheit;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class FahrToCelsiusTest {
    /**
     * Rigorous Test :-)
     */

    @Test
    public void objectOfClassMustNotBeNull() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        assertNotNull(ctf);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIsZero() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 0;
        double expected = -17.8;
        double result = ctf.fahrenheitToCelsius(input);
        assertTrue(expected == result);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIs1() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 1;
        double expected = -17.2;
        double result = ctf.fahrenheitToCelsius(input);
        assertTrue(expected == result);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIs50() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 50;
        double expected = 10;
        double result = ctf.fahrenheitToCelsius(input);
        assertTrue(expected == result);
    }

    @Test
    public void mustReturnCorrectlyWhenInputIs100() {
        CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
        double input = 100;
        double expected = 37.8;
        double result = ctf.fahrenheitToCelsius(input);
        assertTrue(expected == result);
    }


}
