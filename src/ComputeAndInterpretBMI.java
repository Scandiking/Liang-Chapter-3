import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {

        // INPUT ...
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.println("Enter height in inches: ");
        double height = sc.nextDouble();

        // Konstanter
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // COMPUTE ...
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // OUTPUT ...
        // Display results
        System.out.println("BMI is " + bmi);
        if (bmi <= 18.4)
            System.out.println("Underweight\n"+"Low risk of diabetes, heightened risk of other health problems");
        else if (bmi >= 18.5 && bmi <= 24.9)
            System.out.println("Normal\n"+"Low health risk");
        else if (bmi >= 25 && bmi <= 29.9)
            System.out.println("Overweight\n"+"Increased risk of diabetes");
        else if (bmi >=30 && bmi <= 39.9)
            System.out.println("Obese, grade 1\nIncreased risk of diabetes\nIncreased risk of death");
        else if (bmi < 40)
            System.out.println("Obese, grade 2\nHigh risk of other health problems\nHeightened risk of death");
        else
            System.out.println("Obese, grade 3\nSeverely heightened risk of diabetes\nSeverely heightened risk of death");
        }
    }

