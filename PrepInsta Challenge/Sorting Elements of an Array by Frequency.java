import java.util.*;

public class SortByFrequency {
    public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        List<Integer> sortedList = new ArrayList<>(freqMap.keySet());
        sortedList.sort((a, b) -> freqMap.get(b).equals(freqMap.get(a)) ? a - b : freqMap.get(b) - freqMap.get(a));
        for (int num : sortedList) {
            for (int i = 0; i < freqMap.get(num); i++) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};
        sortByFrequency(arr); // Output: 5 5 4 4 3 6
    }
}
