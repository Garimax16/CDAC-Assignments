import java.util.HashMap;

public class FrequencyOfElements {
    public static void findFrequency(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        freqMap.forEach((key, value) -> System.out.println(key + " appears " + value + " times"));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 5};
        findFrequency(arr);
    }
}
