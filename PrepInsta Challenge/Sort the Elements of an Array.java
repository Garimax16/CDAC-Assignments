import java.util.Arrays;

public class SortArray {
    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
    }
}
