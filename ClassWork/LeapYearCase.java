import java.util.Scanner;

public class LeapYearCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        int result = (year % 400 == 0) ? 0 : (year % 100 == 0) ? 1 : (year % 4 == 0) ? 0 : 1;

        switch (result) {
            case 0:
                System.out.println(year + " is a leap year.");
                break;
            case 1:
                System.out.println(year + " is not a leap year.");
                break;
            default:
                System.out.println("Invalid input.");
                break;
        }

        scanner.close();
    }
}
