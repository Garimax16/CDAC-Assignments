import java.util.Arrays;

public class MaxScalarProduct {
    public static int maxScalarProduct(int[] vec1, int[] vec2) {
        Arrays.sort(vec1);
        Arrays.sort(vec2);
        int product = 0;
        for (int i = 0; i < vec1.length; i++) {
            product += vec1[i] * vec2[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int[] vec1 = {1, 3, 5};
        int[] vec2 = {2, 4, 6};
        System.out.println("Maximum Scalar Product: " + maxScalarProduct(vec1, vec2)); // Output: 44
    }
}
