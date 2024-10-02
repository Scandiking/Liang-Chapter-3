import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // Instantiate scanner object
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");

        // Save input in an datatype integer variable
        int year = sc.nextInt();

        // Check statement
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Respond to user
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }
}
