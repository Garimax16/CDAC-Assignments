public class LastNonZeroDigit {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static int lastNonZeroDigit(int n) {
        int fact = factorial(n);
        while (fact % 10 == 0) {
            fact /= 10;
        }
        return fact % 10;
    }

    public static void main(String[] args) {
        System.out.println(lastNonZeroDigit(5)); // Output: 2
    }
}
