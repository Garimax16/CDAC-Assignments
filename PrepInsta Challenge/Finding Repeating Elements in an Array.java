import java.util.HashSet;

public class RepeatingElements {
    public static void findRepeating(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                repeating.add(num);
            }
        }
        System.out.println("Repeating Elements: " + repeating);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        findRepeating(arr); // Output: [2, 4]
    }
}
