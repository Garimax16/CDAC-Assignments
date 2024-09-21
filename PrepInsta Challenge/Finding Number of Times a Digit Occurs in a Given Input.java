import java.util.Scanner;

public class CountDigitOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter the digit to count:");
        int digit = sc.nextInt();

        int count = 0;
        while (num != 0) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }

        System.out.println("The digit " + digit + " occurs " + count + " times.");
    }
}
