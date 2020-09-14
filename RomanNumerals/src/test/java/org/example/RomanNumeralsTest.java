package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class RomanNumeralsTest {
    /**
     * Rigorous Test :-)
     */

    private RomanNumerals rn;

    @BeforeEach
    public void setup() {
        rn = new RomanNumerals();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void instanceOfClassShouldNotBeNull() {
        assertNotNull(rn);
    }

    @Test
    public void input1mustreturnI() {
        int input = 1;
        String expected = "I";

        String result = rn.toRoman(input);
        assertEquals(expected, result);
    }

    @Test
    public void input2mustreturnII() {
        int input = 2;
        String expected = "II";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input3mustreturnIII() {
        int input = 3;
        String expected = "III";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input4mustreturnIV() {
        int input = 4;
        String expected = "IV";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input5mustreturnV() {
        int input = 5;
        String expected = "V";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input8mustreturnVIII() {
        int input = 8;
        String expected = "VIII";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input9mustreturnIX() {
        int input = 9;
        String expected = "IX";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input10mustreturnX() {
        int input = 10;
        String expected = "X";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input40mustreturnXL() {
        int input = 40;
        String expected = "XL";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input50mustreturnL() {
        int input = 50;
        String expected = "L";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input48mustreturnXLVIII() {
        int input = 48;
        String expected = "XLVIII";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input3949mustreturnMMMCMXLIX() {
        int input = 3949;
        String expected = "MMMCMXLIX";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }

    @Test
    public void input2567mustreturnMMDLXVII() {
        int input = 2567;
        String expected = "MMDLXVII";

        String actual = rn.toRoman(input);
        assertEquals(expected, actual);
    }


}
