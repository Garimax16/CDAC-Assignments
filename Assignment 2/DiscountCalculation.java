import java.util.Scanner;

public class DiscountCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        System.out.print("Do you have a membership card? (yes/no): ");
        String hasM javaembership = scanner.next();

        double discount;

        if (purchaseAmount >= 1000) {
            discount = 20;
        } else if (purchaseAmount >= 500) {
            discount = 10;
        } else {
            discount = 5;
        }

        if (hasMembership.equalsIgnoreCase("yes")) {
            discount += 5;
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discount / 100);
        System.out.println("The final price after discount is: Rs." + finalPrice);

        scanner.close();
    }
}
