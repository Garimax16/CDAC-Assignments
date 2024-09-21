import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range (start and end):");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int sum = 0, original = num, digits = String.valueOf(num).length();

            while (original != 0) {
                int digit = original % 10;
                sum += Math.pow(digit, digits);
                original /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }
}
