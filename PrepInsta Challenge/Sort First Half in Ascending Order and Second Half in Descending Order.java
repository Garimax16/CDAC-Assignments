import java.util.Arrays;
import java.util.Collections;

public class SortHalfArray {
    public static void sortHalf(int[] arr) {
        int mid = arr.length / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, arr.length);
        for (int i = mid, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 6, 7, 8, 9};
        sortHalf(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr)); // Output: [2, 3, 4, 5, 9, 8, 7, 6, 1]
    }
}
