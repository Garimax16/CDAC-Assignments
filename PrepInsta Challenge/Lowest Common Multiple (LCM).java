import java.util.Scanner;

public class LCM {
    public static int findHCF(int a, int b) {
        if (b == 0)
            return a;
        return findHCF(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findHCF(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("LCM: " + findLCM(a, b));
    }
}
