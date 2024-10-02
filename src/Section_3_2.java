/*
Game: multiply three numbers
The program in Listing 3.1 Addition Quiz.java, generates two integers and prompts the user to enter the
product of these two integers. Revise the program to generate three single-digit integers and prompt the user to
enter the multiplication of these three integers.
 */

import java.util.Scanner;
public class Section_3_2 {
    public static void main(String[] args) {
        // INPUT...
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int product = number1 * number2;
        Scanner scanscan = new Scanner(System.in);
        System.out.println("Enter the product of " + number1 + " and " + number2 + ": ");

        product = scanscan.nextInt();

        // CALCULATIONS AND OUTPUT ...
        if (product == number1 * number2) {
            System.out.println("Correct\n" + number1 + " * " + number2 + " = " + (number1 * number2));
        } else if (product > number1 * number2) {
            System.out.println("Incorrect\n" + number1 + " * " + number2 + " = " + (number1 * number2));
        } else if (product < number1 * number2) {
            System.out.println("Incorrect\n"+ number1 + " * " + number2 + " = " + (number1*number2));
        }
    }
}
