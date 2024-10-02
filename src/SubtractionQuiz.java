import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        // Opprett to tilfeldige enkeltsiffer integere for å regne på
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // Om number1 < number2, bytt om number1 med number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3. Prompt the student to answer "what is number 1 - number2?"
        System.out.println("What is " + number1 + " - " + number2 + "? ");
        // Opprette skanner for å lese brukerinput
        Scanner input = new Scanner(System.in);
        // Lese brukerinput
        int answer = input.nextInt();

        // 4. Grade the answer and display the result
        // Om svar stemmer, bekreft ovenfor bruker
        if (number1 - number2 == answer)
            System.out.println("You are correct");
        else {
            // Om svar ikke stemmer, bekreft ovenfor brukeren
            System.out.println("You are incorrect");
            // og vis hva som burde blitt svart
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
