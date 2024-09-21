import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0, original = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (original % sum == 0) {
            System.out.println(original + " is a Harshad number.");
        } else {
            System.out.println(original + " is not a Harshad number.");
        }
    }
}
