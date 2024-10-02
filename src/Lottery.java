/*
    Suppose you want to develop a program to play lottery. The program randomly generates a lottery of two-digit number,
    prompts the user to enter a two-digit number, and determines whether the user wins according to the following rules:

    1. If the user input matches the lottery number in exact order, the award is $10,000
    2. If all digits in the user input match all digits in the lottery number, the ward is $3,000
    3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.

    Note the digits of a two-digit number may be 0. If a number is less than 10, we assume that the number is
    preceded by a 0 to form a two-digit number. For example, number 8 is treated as 08 and number 0 is treated as
    00 in the program.

    -- Liang, 2020, p. 122
 */

// For reading user input
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate a random number >=0 to <=99
        int lottery = (int)(Math.random() * 100);

        // Instantiate scanner object
        Scanner scanscan = new Scanner(System.in);

        // INPUT ...
        // Prompt user for guess number
        System.out.print("Enter your lottery pick, two digits: ");

        // COMPUTING ...
        // Save guess into int varaible
        int guess = scanscan.nextInt();

        // Get digits from lottery
        int lotteryDigit1 = lottery/10;
        int lotteryDigit2 = lottery%10;

        // Get digits from guess
        int guessDigit1 = guess/10;
        int guessDigit2 = guess%10;

        // User response
        System.out.println("The lottery number is " + lottery);

        // Cover cases of guess results
        // if guess equals lottery number is exact match and player wins jackpot
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");

        // if number is 76 and user guesses 67
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");

        // if number is 54 and user guesses a number which has a digit that contains one of the digits in the lottery number
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");

        // OUTPUT ...
        // if lottery number is 64 and user guesses for example 11
        else
            System.out.println("Sorry, no match");
    }
}
