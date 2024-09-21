import java.util.*;

public class PascalTriangle {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(Arrays.asList(1));
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1);
        }
        return row;
    }

    public static void main(String[] args) {
        System.out.println(getRow(4)); // Output: [1, 4, 6, 4, 1]
    }
}
