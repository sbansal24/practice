package Algorithms;

public class DiagonalTraversalMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}};
        System.out.println(arr.length);
        int m = arr.length;
        int n = arr[0].length;
        int even = 0;
        int odd = 1;
        while (even < m) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[even][i] + " ");
            }
            System.out.println();
            even += 2;
            if (odd < m) {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[odd][i] + " ");
                }
            }
            odd += 2;
            System.out.println();
        }
    }
}
