import java.util.Scanner;

public class FibonacciNthTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int a = 0, b = 1, next = 0;

        for (int i = 2; i <= n; i++) {
            next = a + b;
            a = b;
            b = next;
        }

        System.out.println("The " + n + "th term of the Fibonacci series is: " + next);
    }
}
