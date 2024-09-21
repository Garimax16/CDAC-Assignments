import java.util.Scanner;

public class AddFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator and denominator of first fraction:");
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        System.out.println("Enter numerator and denominator of second fraction:");
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();

        int numSum = (num1 * den2) + (num2 * den1);
        int denSum = den1 * den2;

        int gcd = gcd(numSum, denSum);

        System.out.println("Sum of fractions: " + (numSum / gcd) + "/" + (denSum / gcd));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
