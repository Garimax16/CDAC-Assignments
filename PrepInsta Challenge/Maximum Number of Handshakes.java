import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int n = sc.nextInt();
        int handshakes = n * (n - 1) / 2;
        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}
