import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and exponent:");
        int base = sc.nextInt();
        int exponent = sc.nextInt();

        long result = (long) Math.pow(base, exponent);
        System.out.println(base + " to the power " + exponent + " is: " + result);
    }
}
