public class LongestPalindrome {
    public static boolean isPalindrome(int num) {
        String s = Integer.toString(num);
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static int findLongestPalindrome(int[] arr) {
        int longest = -1;
        for (int num : arr) {
            if (isPalindrome(num) && num > longest) {
                longest = num;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {121, 131, 20, 33, 303};
        System.out.println("Longest Palindrome: " + findLongestPalindrome(arr)); // Output: 303
    }
}
