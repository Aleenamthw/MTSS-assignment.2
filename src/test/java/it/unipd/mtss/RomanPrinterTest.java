////////////////////////////////////////////////////////////////////
// SARA STEFANI 2077673
// ALEENA MATHEW 2068242
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {
    /*
     * Test the letter I
     */
    @Test
    public void testLetterI() {
        try {
            String result = RomanPrinter.print(1);

            assertEquals(" _____ \n" + //
                    "|_   _|\n" + //
                    "  | |  \n" + //
                    "  | |  \n" + //
                    " _| |_ \n" + //
                    "|_____|\n", result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the letter V
     */
    @Test
    public void testLetterV() {
        try {

            String result = RomanPrinter.print(5);
            assertEquals("__      __ \n" + //
                    "\\ \\    / / \n" + //
                    " \\ \\  / /  \n" + //
                    "  \\ \\/ /   \n" + //
                    "   \\  /    \n" + //
                    "    \\/     \n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /*
     * Test the number 8
     */
    @Test
    public void testNumberEightPrint() {
        try {
            String result = RomanPrinter.print(8);

            assertEquals(
                    "__      __  _____  _____  _____ \n" + //
                                                "\\ \\    / / |_   _||_   _||_   _|\n" + //
                                                " \\ \\  / /    | |    | |    | |  \n" + //
                                                "  \\ \\/ /     | |    | |    | |  \n" + //
                                                "   \\  /     _| |_  _| |_  _| |_ \n" + //
                                                "    \\/     |_____||_____||_____|\n",
                    result);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /*
     * Test the letter X
     */
    @Test
    public void testLetterX() {
        try {
            String result = RomanPrinter.print(10);

            assertEquals("__   __ \n" + //
                                "\\ \\ / / \n" + //
                                " \\ V /  \n" + //
                                "  > <   \n" + //
                                " / . \\  \n" + //
                                "/_/ \\_\\ \n", result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the number 14
     */
    @Test
    public void testNumerFourteenPrint() {
        try {

            String result = RomanPrinter.print(14);
            assertEquals(
                    "__   __  _____ __      __ \n" + //
                                                "\\ \\ / / |_   _|\\ \\    / / \n" + //
                                                " \\ V /    | |   \\ \\  / /  \n" + //
                                                "  > <     | |    \\ \\/ /   \n" + //
                                                " / . \\   _| |_    \\  /    \n" + //
                                                "/_/ \\_\\ |_____|    \\/     \n" //
                                ,
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the letter L
     */
    @Test
    public void testLetterL() {
        try {

            String result = RomanPrinter.print(50);
            assertEquals(" _      \n" + //
                                "| |     \n" + //
                                "| |     \n" + //
                                "| |     \n" + //
                                "| |____ \n" + //
                                "|______|\n" //
                                , result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the number 41
     */
    @Test
    public void testNumberFortyOnePrint() {

        try {
            String result = RomanPrinter.print(41);
            assertEquals(
                    "__   __  _       _____ \n" + //
                                                "\\ \\ / / | |     |_   _|\n" + //
                                                " \\ V /  | |       | |  \n" + //
                                                "  > <   | |       | |  \n" + //
                                                " / . \\  | |____  _| |_ \n" + //
                                                "/_/ \\_\\ |______||_____|\n",
                    result);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /*
     * Test the number 49
     */
    @Test
    public void testNumberFortyNinePrint() {
        try {

            String result = RomanPrinter.print(49);
            assertEquals(
                    "__   __  _       _____ __   __ \n" + //
                                                "\\ \\ / / | |     |_   _|\\ \\ / / \n" + //
                                                " \\ V /  | |       | |   \\ V /  \n" + //
                                                "  > <   | |       | |    > <   \n" + //
                                                " / . \\  | |____  _| |_  / . \\  \n" + //
                                                "/_/ \\_\\ |______||_____|/_/ \\_\\ \n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the number 90
     */
    @Test
    public void testNumberNinetyPrint() {
        try {

            String result = RomanPrinter.print(90);
            assertEquals(
                    "__   __   _____ \n" + //
                            "\\ \\ / /  / ____|\n" + //
                            " \\ V /  | |     \n" + //
                            "  > <   | |     \n" + //
                            " / . \\  | |____ \n" + //
                            "/_/ \\_\\  \\_____|\n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test number 123
     */
    @Test
    public void testNumberOneHundredTwentyThreePrint() {

        try {
            String result = RomanPrinter.print(123);

            assertEquals(
                    "  _____ __   __ __   __  _____  _____  _____ \n" + //
                            " / ____|\\ \\ / / \\ \\ / / |_   _||_   _||_   _|\n" + //
                            "| |      \\ V /   \\ V /    | |    | |    | |  \n" + //
                            "| |       > <     > <     | |    | |    | |  \n" + //
                            "| |____  / . \\   / . \\   _| |_  _| |_  _| |_ \n" + //
                            " \\_____|/_/ \\_\\ /_/ \\_\\ |_____||_____||_____|\n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /*
     * Test the number 400
     */
    @Test
    public void testNumberFourHundredPrint() {
        try {

            String result = RomanPrinter.print(400);
            assertEquals(
                    "  _____  _____  \n / ____||  __ \\ \n| |     | |  | |\n| |     | |  | |\n| |____ | |__| |\n \\_____||_____/ \n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the number 699
     */
    @Test
    public void testNumberSixHundredNinetyNinePrint() {
        try {

            String result = RomanPrinter.print(699);
            assertEquals(
                    " _____    _____ __   __   _____  _____ __   __ \n" + //
                            "|  __ \\  / ____|\\ \\ / /  / ____||_   _|\\ \\ / / \n" + //
                            "| |  | || |      \\ V /  | |       | |   \\ V /  \n" + //
                            "| |  | || |       > <   | |       | |    > <   \n" + //
                            "| |__| || |____  / . \\  | |____  _| |_  / . \\  \n" + //
                            "|_____/  \\_____|/_/ \\_\\  \\_____||_____|/_/ \\_\\ \n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the number 919
     */
    @Test
    public void testNumberNineHundredNineteenPrint() {
        try {
            String result = RomanPrinter.print(919);

            assertEquals(
                    "  _____  __  __ __   __  _____ __   __ \n" + //
                            " / ____||  \\/  |\\ \\ / / |_   _|\\ \\ / / \n" + //
                            "| |     | \\  / | \\ V /    | |   \\ V /  \n" + //
                            "| |     | |\\/| |  > <     | |    > <   \n" + //
                            "| |____ | |  | | / . \\   _| |_  / . \\  \n" + //
                            " \\_____||_|  |_|/_/ \\_\\ |_____|/_/ \\_\\ \n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /*
     * Test the number 999
     */
    @Test
    public void testNumberNineHundredNinetyNinePrint() {
        try {

            String result = RomanPrinter.print(999);
            assertEquals(
                    "  _____  __  __ __   __   _____  _____ __   __ \n" + //
                            " / ____||  \\/  |\\ \\ / /  / ____||_   _|\\ \\ / / \n" + //
                            "| |     | \\  / | \\ V /  | |       | |   \\ V /  \n" + //
                            "| |     | |\\/| |  > <   | |       | |    > <   \n" + //
                            "| |____ | |  | | / . \\  | |____  _| |_  / . \\  \n" + //
                            " \\_____||_|  |_|/_/ \\_\\  \\_____||_____|/_/ \\_\\ \n",
                    result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    /*
     * Test the number 1000
     */
    @Test
    public void testNumberOneThousandPrint() {

        try {

            String result = RomanPrinter.print(1000);
            assertEquals(" __  __ \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n", result);
        } catch (Exception e) {
            System.err.println(e);
        }

    }


    @Test
    public void printNoCharacter() {
        try {

            assertEquals("", RomanPrinter.print(0));
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
