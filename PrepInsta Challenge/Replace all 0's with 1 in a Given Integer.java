import java.util.Scanner;

public class ReplaceZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();

        String result = Integer.toString(num).replace('0', '1');
        System.out.println("Modified number: " + result);
    }
}
