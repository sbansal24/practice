package Algorithms.ArrayAlgorithms;

public class MatrixSpiralRotation {
    public static void main(String[] args) {
        int m = 3; int n = 6;
        int arr[][] = { {1,  2,  3,  4,  5,  6},
                {7,  8,  9,  10, 11, 12},
                {13, 14, 15, 16, 17, 18}
        };
        System.out.println(arr[0][1]);
        int k = 0;
        int l = 0;
        for (int i = l; i < n; ++i)
        {
            System.out.print(arr[k][i]+" ");
        }
    }
}
