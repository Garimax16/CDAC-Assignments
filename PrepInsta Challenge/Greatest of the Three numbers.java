import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int greatest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3 ? num2 : num3);
        System.out.println("The greatest number is: " + greatest);
    }
}
