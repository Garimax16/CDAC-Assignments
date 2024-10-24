import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else if (bmi >= 30 && bmi < 34.9) {
            System.out.println("You have obesity class I.");
        } else if (bmi >= 35 && bmi < 39.9) {
            System.out.println("You have obesity class II.");
        } else {
            System.out.println("You have obesity class III.");
        }

        scanner.close();
    }
}
