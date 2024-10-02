import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        // Instansierer skannerobjekt
        Scanner sc = new Scanner(System.in);

        // Ber bruker om input
        System.out.println("Enter an integer: ");

        // Lagrer brukers input i integervariabel
        int num = sc.nextInt();

        // Om taller brukeren inputet heltallsdivideres på 5 og får null i rest (f.eks 10, 15, 20 eller 25)
        // print hifive
        if (num % 5 == 0)
            System.out.println("HiFive");

        // Om tallet er et partall print HiEven
        if (num % 2 == 0)
            System.out.println("HiEven");
    }
}
