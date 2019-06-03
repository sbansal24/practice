package Algorithms.ArrayAlgorithms;

public class MaximunSuminArrayNoTwoElementsAreAdjacent {
    public static void main(String[] args) {
        int arr[] = {5, 20, 10, 100, 10, 5};
        int n = arr.length;
        System.out.println("maximun sum is " + getMaximumSum(arr, n));

    }

    private static int getMaximumSum(int[] arr, int n) {
        int incl = arr[0];
        int excl = 0;
        int excl_new;
        for (int i = 1; i < n; i++) {
            excl_new = incl > excl ? incl : excl;
            incl = excl + arr[i];
            excl = excl_new;
        }
        return incl > excl ? incl : excl;
    }
}
