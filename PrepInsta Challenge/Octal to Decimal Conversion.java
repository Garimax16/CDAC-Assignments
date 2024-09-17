import java.util.Scanner;

public class OctalToDecimal {
    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octal = sc.nextLine();
        System.out.println("Decimal: " + octalToDecimal(octal));
    }
}
