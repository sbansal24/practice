package Algorithms.ArrayAlgorithms;

//Here we are assuming that array is a sorted array
public class FindTripletsInAP {
    public static void main(String[] args) {
        int arr[] = {2, 6, 9, 12, 17, 22, 31, 32, 35, 42};
        int n = arr.length;
        findAndPrintTriplets(arr, n);
    }

    private static void findAndPrintTriplets(int[] arr, int n) {
        for (int i = 1; i < n - 1; i++) {
            for (int j = i - 1, k = i + 1; j >= 0 && k < n - 1; ) {
                if(arr[j]+arr[k] == 2*arr[i]){
                    System.out.println(arr[j] +" " +
                            arr[i]+ " " + arr[k]);
                    k++;
                    j--;
                } else if(arr[j]+arr[k] < 2*arr[i]){
                    k++;
                } else{
                    j--;
                }
            }
        }
    }
}
