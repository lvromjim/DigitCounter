/*
 * Program: Digit Counter
 *
 * Description:
 * This program asks the user to enter an integer and
 * counts the number of digits contained in that number.
 *
 * The input number must be between -3,000,000,000
 * and 3,000,000,000.
 *
 * The negative sign is not considered a digit.
 *
 * The program uses the long data type because the maximum
 * input value is greater than the positive range of int.
 */

import java.util.Scanner;

public class DigitCounter {

    /*
     * Counts the number of digits in the given number.
     *
     * The number is repeatedly divided by 10.
     * Each division removes one digit from the number,
     * so the digit counter is increased after every division.
     *
     * The value 0 is handled separately because 0 contains
     * one digit, but the while loop would not execute for it.
     *
     * @param number the integer whose digits will be counted
     * @return the number of digits in the input number
     */
    public static int countDigits(long number) {

        /*
         * Zero is a special case because it contains
         * exactly one digit.
         */
        if (number == 0) {
            return 1;
        }

        int digitCount = 0;

        /*
         * Divide the number by 10 until it becomes zero.
         * Each iteration represents one digit.
         */
        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        return digitCount;
    }

    /*
     * Main method.
     *
     * It interacts with the user by requesting an integer,
     * calculating the number of digits, and displaying
     * the corresponding result.
     */
    public static void main(String[] args) {

        /*
         * Create a Scanner object to read data
         * entered by the user.
         */
        Scanner scanner = new Scanner(System.in);

        /*
         * Request the user to enter an integer.
         */
        System.out.print("Enter an integer: ");

        /*
         * Read the number entered by the user.
         */
        long number = scanner.nextLong();

        /*
         * Calculate the number of digits.
         */
        int result = countDigits(number);

        /*
         * Display the result to the user.
         */
        System.out.println("The number of digits is: " + result);

        /*
         * Close the Scanner resource.
         */
        scanner.close();
    }
}