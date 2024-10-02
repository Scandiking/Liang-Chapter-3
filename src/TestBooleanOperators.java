/*
Logical operators used in this program
&& = AND
|| = OR
^ = XOR (exclusive or)

The program takes an integer from the user and checks the statement for logical operators and prints a
response based on the logical operators in the statement.
E.g. if number = 6 the statement
if (6 % 2 == 0 && 6 % 3 = 0), the number (6) is divisible by 2 and 3 is true.
if (6 % 2 == 00 || 6 % 3 = 0) the number (6) is divisible by 2 or 3 is true.
if (6 % 2 == 0 ^ 6 % 3 == 0) the number (6) is in fact divisible by both 2 and 3, thus this statement is false.

If the number is a number that do not support any statement, such as 77, nothing will be printed because none of the
statements will be true.

 */

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner scanscsan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanscsan.nextInt();

        // AND operator &&
        if (number % 2 == 0 && number % 3 == 0)
            System.out.println(number + " is divisible by 2 and 3.");

        // OR operator ||
        if (number % 2 == 0 || number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3.");

        // XOR (exclusive or) operator ^
        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3, but not both.");

        else System.out.printf("""
                You entered a number that doesn't make any of the hardcoded statements true,
                thus you see this message instead. Your number was\s""" + number);
    }
}
