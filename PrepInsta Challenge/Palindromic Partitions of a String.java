import java.util.*;

public class PalindromePartition {
    public static void allPalindromicPartitions(String s) {
        List<List<String>> allPartitions = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();
        findPartitions(allPartitions, currentPartition, 0, s.length(), s);
        for (List<String> partition : allPartitions) {
            System.out.println(partition);
        }
    }

    private static void findPartitions(List<List<String>> allPartitions, List<String> currentPartition, int start, int end, String s) {
        if (start >= end) {
            allPartitions.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int i = start; i < end; i++) {
            if (isPalindrome(s, start, i)) {
                currentPartition.add(s.substring(start, i + 1));
                findPartitions(allPartitions, currentPartition, i + 1, end, s);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        allPalindromicPartitions("aab");
    }
}
