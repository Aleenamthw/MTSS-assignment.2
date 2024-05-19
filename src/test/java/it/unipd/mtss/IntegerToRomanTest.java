////////////////////////////////////////////////////////////////////
// SARA STEFANI 2077673
// ALEENA MATHEW 2068242
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testConvert1() {
        try {
            assertEquals("I", IntegerToRoman.convert(1));
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    @Test
    public void testConvert4() {
        try {
            assertEquals("IV", IntegerToRoman.convert(4));
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    @Test
    public void testConvert5() {
        try {
            assertEquals("V", IntegerToRoman.convert(5));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert6() {
        try {

            assertEquals("VI", IntegerToRoman.convert(6));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert9() {

        try {

            assertEquals("IX", IntegerToRoman.convert(9));
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    @Test
    public void testConvert10() {
        try {

            assertEquals("X", IntegerToRoman.convert(10));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert11() {
        try {

            assertEquals("XI", IntegerToRoman.convert(11));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert14() {
        try {

            assertEquals("XIV", IntegerToRoman.convert(14));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert15() {

        try {

            assertEquals("XV", IntegerToRoman.convert(15));
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    @Test
    public void testConvert19() {
        try {

            assertEquals("XIX", IntegerToRoman.convert(19));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert20() {
        try {

            assertEquals("XX", IntegerToRoman.convert(20));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert50() {
        try {

            assertEquals("L", IntegerToRoman.convert(50));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert100() {
        try {

            assertEquals("C", IntegerToRoman.convert(100));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert500() {
        try {

            assertEquals("D", IntegerToRoman.convert(500));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert1000() {
        try {

            assertEquals("M", IntegerToRoman.convert(1000));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert999() {
        try {

            assertEquals("CMXCIX", IntegerToRoman.convert(999));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert40() {
        try {

            assertEquals("XL", IntegerToRoman.convert(40));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert900() {
        try {

            assertEquals("CM", IntegerToRoman.convert(900));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert39() {
        try {

            assertEquals("XXXIX", IntegerToRoman.convert(39));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert499() {
        try {

            assertEquals("CDXCIX", IntegerToRoman.convert(499));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert3() {

        try {

            assertEquals("III", IntegerToRoman.convert(3));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert8() {
        try {

            assertEquals("VIII", IntegerToRoman.convert(8));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void testConvert12() {
        try {

            assertEquals("XII", IntegerToRoman.convert(12));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void convertZero() {
        try {

            assertEquals("", IntegerToRoman.convert(0));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Test
    public void convertBelowZero() {
        try {

            assertEquals("", IntegerToRoman.convert(-1));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
