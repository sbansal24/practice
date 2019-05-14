package Algorithms.HashBasedAlgos;

import java.util.HashSet;

public class LargestContinousSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
        int max_len = 1;
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            HashSet<Integer> set = new HashSet<>();
            set.add(arr[i]);
            int mn = arr[i];
            int mx = arr[i];
            for (int j = i + 1; j <n; j++) {
                if (set.contains(arr[j]))
                    break;

                set.add(arr[j]);
                mn = Math.min(mn, arr[j]);
                mx = Math.max(mx, arr[j]);
                if (mx - mn == j - i)
                    max_len = Math.max(max_len, mx - mn + 1);

            }
        }

        System.out.println(max_len);
    }
}
