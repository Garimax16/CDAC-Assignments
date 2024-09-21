import java.util.Scanner;

public class NumberToWords {
    static String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();

        System.out.println("Number in words: " + convertToWords(num));
    }

    public static String convertToWords(int num) {
        if (num == 0) return units[0];

        StringBuilder words = new StringBuilder();
        while (num > 0) {
            int digit = num % 10;
            words.insert(0, units[digit] + " ");
            num /= 10;
        }

        return words.toString().trim();
    }
}
