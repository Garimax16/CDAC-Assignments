import java.util.*;

public class SubsetSums {
    public static void subsetSums(int[] arr, int n, int index, int sum, List<Integer> sums) {
        if (index == n) {
            sums.add(sum);
            return;
        }
        subsetSums(arr, n, index + 1, sum + arr[index], sums);
        subsetSums(arr, n, index + 1, sum, sums);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> sums = new ArrayList<>();
        subsetSums(arr, arr.length, 0, 0, sums);
        System.out.println(sums);
    }
}
