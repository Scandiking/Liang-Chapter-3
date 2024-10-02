/*
    (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using Cramer's rule given in
    Programming Exercise 1.13. Write a program that prompts the user to enter a, b, c, d, e, and f and
    displays the result. If ad - bc is 0, report that "The equation has no solution."
    -- Liang, 2020, p. 133
 */

import java.util.Scanner;

public class Section_3_3 {
    public static void main(String[] args) {

        // Instantiating Scanner object
        Scanner scanscan = new Scanner(System.in);

        // Prompts user for variable values
        System.out.println("Enter a: ");
        double a = scanscan.nextDouble();
        System.out.println("Enter b: ");
        double b = scanscan.nextDouble();
        System.out.println("Enter c: ");
        double c = scanscan.nextDouble();
        System.out.println("Enter d: ");
        double d = scanscan.nextDouble();
        System.out.println("Enter e: ");
        double e = scanscan.nextDouble();
        System.out.println("Enter f: ");
        double f = scanscan.nextDouble();

        // Calculate the denominator (ad - bc)
        double denominator = (a * d) - (b * c);

        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            // Use Cramer's rule
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;

            // Display results
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
