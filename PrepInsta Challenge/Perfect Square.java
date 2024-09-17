import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        double sqrt = Math.sqrt(num);
        if (sqrt == Math.floor(sqrt)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }
}
