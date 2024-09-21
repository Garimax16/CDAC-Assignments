import java.util.HashSet;

public class CountDistinct {
    public static int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        System.out.println("Distinct Elements: " + countDistinct(arr)); // Output: 5
    }
}
