/*
    Now let us write a program to find out the Chinese Zodiac sign for a given year. The Chinese Zodiac is based on a
    12-year cycle, with each year represented by an animal - monkey, rooster, dog, pig, rat, ox, tiger, rabbit, dragon,
    snake, horse or sheep - in this cycle, as show in Figure 3.6. Note year % 12 determines the Zodiac sign. 1900 is the
    year of the rat because 1900 % 12 is 4. Listing 3.9 gives a program that prompts the user to enter a year and
    displays the animal for the year.
    -- Liang, 2020, p. 125-126
 */

// Import scanner to read user input
import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        // instantiate scanner instance
        Scanner scanscan  = new Scanner(System.in);

        // Prompt user to enter a year for finding out what animal corresponds to it
        System.out.println("Enter a year: ");
        // Save the user input as an integer datatype in a variable called year
        int year = scanscan.nextInt();

        // "A switch statement executes statements based on the value of a variable or an expression"
        //  -- Liang, 2020, p. 124
        // The statement is year % 12
        // e.g. 1200 % 12 = 0, therefore 1200 is the year of the rat.
        // 1201 % 12 = 1, therefore 1201 is the year of the rooster.
        // 2024 % 12 = 8, therefore 2024 is the year of the dragon.

        switch (year % 12) {
            case 0: System.out.println("monkey"); break;
            case 1: System.out.println("rooster"); break;
            case 2: System.out.println("dog"); break;
            case 3: System.out.println("pig"); break;
            case 4: System.out.println("rat"); break;
            case 5: System.out.println("ox"); break;
            case 6: System.out.println("tiger"); break;
            case 7: System.out.println("rabbit"); break;
            case 8: System.out.println("dragon"); break;
            case 9: System.out.println("snake"); break;
            case 10: System.out.println("horse"); break;
            case 11: System.out.println("sheep"); break;
        }
    }
}
