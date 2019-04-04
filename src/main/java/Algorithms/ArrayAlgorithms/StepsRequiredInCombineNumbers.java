package Algorithms.ArrayAlgorithms;

public class StepsRequiredInCombineNumbers {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9, 5, 8, 7, 4};
        int beg = 0, end = arr.length - 1;
        int count = 0;
        int number = 5;
        while (beg < end) {
            while (arr[beg] < number && beg < end) {
                beg++;
            }
            while (arr[end] > number && beg < end) {
                end--;
            }
            if (arr[beg] > arr[end]) {
                int temp = arr[beg];
                arr[beg] = arr[end];
                arr[end] = temp;
                count++;
            }
        }
        System.out.println(count);
    }
}
