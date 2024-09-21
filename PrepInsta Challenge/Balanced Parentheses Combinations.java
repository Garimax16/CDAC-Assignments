public class BalancedParentheses {
    public static void generateParenthesis(int open, int close, String str) {
        if (open == 0 && close == 0) {
            System.out.println(str);
            return;
        }

        if (open > 0) {
            generateParenthesis(open - 1, close, str + "(");
        }
        if (close > open) {
            generateParenthesis(open, close - 1, str + ")");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generateParenthesis(n, n, "");
    }
}
