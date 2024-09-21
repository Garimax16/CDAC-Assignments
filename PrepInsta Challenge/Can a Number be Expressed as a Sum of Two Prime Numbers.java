import java.util.Scanner;

public class SumOfTwoPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        boolean canBeExpressed = false;

        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " can be expressed as " + i + " + " + (num - i));
                canBeExpressed = true;
                break;
            }
        }

        if (!canBeExpressed) {
            System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
