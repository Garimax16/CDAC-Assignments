public class NBitBinary {
    public static void generateNBitBinary(int n, int ones, int zeros, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        generateNBitBinary(n - 1, ones + 1, zeros, str + "1");
        if (ones > zeros) {
            generateNBitBinary(n - 1, ones, zeros + 1, str + "0");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generateNBitBinary(n, 0, 0, "");
    }
}
