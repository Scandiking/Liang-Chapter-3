/*

    You are to write a program to compute personal income tax. Your program should prompt the user to enter the
    filing status and taxable income and compute the tax.
    Enter 0 for single filers, 1 for married filing jointly or qualified widow(er),
    2 for married filing separately, and 3 for head of household.
    Your program computes the tax for the taxable income based on the filing status. The filing status can be determined
    using if statements outlined as follows:

    if (status == 0) {
      Compute tax for single filers
    }
    else if (status == 1) {
      Compute tax for married filing jointly
    and so on.

    For each filing status there are six tax rates. Each rate is applied to a certain amount of taxable income.
    For example, of a taxable income of $400.000 for single filers, $8.350 is tazed at 10%,
    (33,950 - 8,350) at 15%, (82,250 - 33,950) at 25%, (171,550 - 82,250) at 28%,
    (372,950 - 171,550) at 33%, and (400,000 - 372,950) at 35%.

    Listing 3.5 gives the solution for computing taxes for single filers. The complete solution is left as an exercise.

    -- Liang, 2020, p. 115

 */

// Scanner to read user input
import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        // INPUT ...
        // Instantiate scanner object
        Scanner scanscan = new Scanner(System.in);

        // Ask user for input
        System.out.println("""
                0-single filer
                1-married jointly or qualifying widow(er)
                2-married separately
                3-head of household
                ---------------
                Enter the filing status by using the corresponding digit:
                """);

        // Save status in variable
        int status = scanscan.nextInt();

        // Ask user for input
        System.out.println("Enter the taxable income: ");
        // Save input in variable
        double income = scanscan.nextDouble();

        // COMPUTING ...

        // Instantiate tax variable, default 0 as no income specified yet
        double tax = 0;

        // Tax calculations for single filers
        if (status == 0) {

            // Tax brackets are decided by using income as the variable
            if (income <= 8350)
                tax = income * 0.10;

            else if (income <= 33950)
                tax = 8350 * 0.10 +
                        (income - 8350) * 0.15;

            else if (income <= 82250)
                tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (income - 33950) * 0.25;

            else if (income <= 171550)
                tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 +
                        (income - 82250) * 0.28;

            else if (income <= 372950)
                tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 +
                        (171550 - 82250) * 0.28 +
                        (income - 171550) * 0.33;

            else tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 +
                        (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 +
                        (income - 372950) * 0.35;
        }

        // Tax calculations for married jointly or qualifying widow(er)
        else if (status == 1) {

            if (income <= 16700)
                tax = income * 0.10;

            else if (income <= 67900)
                tax = 16700 * 0.10 +
                        (income - 16700) * 0.15;

            else if (income <= 137050)
                tax = 16700 * 0.10 +
                        (67900 - 16700) * 0.15 +
                        (income - 67900) * 0.25;

            else if (income <= 208850)
                tax = 16700 * 0.10 +
                        (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 +
                        (income - 137050) * 0.28;

            else if (income <= 372950)
                tax = 16700 * 0.10 +
                        (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 +
                        (208850 - 137050) * 0.28 +
                        (income - 208850) * 0.33;

            else tax = 16700 * 0.10 +
                        (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 +
                        (208850 - 137050) * 0.28 +
                        (372950 - 208850) * 0.33 +
                        (income - 372950) * 0.35;

        }

        // Tax calculation for married separately
        else if (status == 2) {
            if (income <= 8350)
                tax = income * 0.10;

            else if (income <= 33950)
                tax = 8350 * 0.10 +
                        (income - 8350) * 0.15;

            else if (income <= 68525)
                tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (income - 33950) * 0.25;

            else if (income <= 104425)
                tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 +
                        (income - 68525) * 0.28;

            else if (income <= 186475)
                tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 +
                        (104425 - 68525) * 0.28 +
                        (income - 104425) * 0.33;

            else tax = 8350 * 0.10 +
                        (33950 - 8350) * 0.15 +
                        (68525 - 33950) + 0.25 +
                        (104425 - 68525) * 0.28 +
                        (186475 - 104425) * 0.33 +
                        (income - 186475) * 0.35;
            }

        // Tax calculations for head of household
        else if (status == 3) {

            if (income <= 11950)
                tax = income * 0.10;

            else if (income <= 45500)
                tax = 11950 * 0.10 +
                        (income - 11950) * 0.15;

            else if (income <= 117450)
                tax = 11950 * 0.10 +
                        (45500 - 11950) * 0.15 +
                        (income - 45500) * 0.25;

            else if (income <= 190200)
                tax = 11950 * 0.10 +
                        (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 +
                        (income - 117450) * 0.28;

            else if (income <= 372950)
                tax = 11950 * 0.10 +
                        (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 +
                        (190200 - 117450) * 0.28 +
                        (income - 190200) * 0.33;

            else tax = 11950 * 0.10 +
                        (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 +
                        (190200 - 117450) * 0.28 +
                        (372950 - 190200) * 0.33 +
                        (income - 372950) * 0.35;
        }

        // If not 0, 1, 2 or 3, the status for calculation is invalid and program will abort with error message upon exit.
        else {
            System.out.println("Invalid status");
            System.exit(1);
        }

        // OUTPUT ...
        // Outputs what the filer will pay in tax
        System.out.println("Tax is $" + (int)(tax * 100) / 100.0);
    }
}
