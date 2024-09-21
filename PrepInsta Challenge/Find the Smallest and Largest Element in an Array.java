public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = findSmallestAndLargest(arr);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
}
