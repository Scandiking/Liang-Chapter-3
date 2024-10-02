/*
    Algebra: solve quadration equations)
    The two roots of a quadratic equation ax^2 + bx + c = 0 can be obtained using the following formula:
    r_1 = (-b + sqrt(b^2) - 4ac) / (2a) and r_2 = (-b - sqrt(b^2) - 4ac) / (2a)

    b^2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
    Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display two roots. If the discriminant is 0, display one root. Otherwise, display "The equation has no real roots."
    Now you can use Math.pow(x, 0.5) to compute sqrt(x). Here are some sample runs:

    Enter a, b, c: 1.0 3 1 ENTER
    The equation has two roots -0.381966 and -2.61803

    Enter a, b, c: 1 2.0 1 ENTER
    The equation has one root -1.0

    Enter a, b, c: 1 2 3
    The equation has no real roots
    -- Liang, 2020, p. 132
 */

import java.util.Scanner;

public class Section_3_1 {
    public static void main(String[] args) {

        // INPUT ...
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        // COMPUTING ...
        double discriminant = (Math.pow(b, 2) - 4 * a * c);

        // OUTPUT ...
        // If the discriminant is positive, display two roots
        if (discriminant > 0) {
            System.out.println("The equation has two roots: " + ((-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a)) + " and " + ((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / 2 * a)));

        // If the discriminant is 0, display one root
        } else if (discriminant == 0) {
            System.out.println("The equation has one root: " + ((-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a)));

        // Otherwise, display "The equation has no real roots"
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
        }
    }
}
