import java.util.HashMap;

public class NonRepeatingElements {
    public static void findNonRepeating(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Non-Repeating Elements: ");
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        findNonRepeating(arr); // Output: 1 3 5
    }
}
