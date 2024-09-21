import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();
        System.out.println("Decimal: " + binaryToDecimal(binary));
    }
}
