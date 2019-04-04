package Algorithms.ArrayAlgorithms;

public class PrintPyramid {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        int multiplier = 1;
        for (int i = 1; i <= n; ) {
            if (count < i) {
                System.out.print(i * multiplier + " ");
                count++;
                multiplier++;
                continue;
            }

            if (count >= i) {
                multiplier = 1;
                count = 0;
                i++;
                System.out.println();
            }

        }
    }
}
