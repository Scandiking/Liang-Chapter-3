import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {

        // Input...
        Scanner scanscan = new Scanner(System.in);
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 10 % 10);

        System.out.println("What is " + number1 + " + " + number2 + "? ");

        int answer = scanscan.nextInt();

        // Output (including processing...)
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
