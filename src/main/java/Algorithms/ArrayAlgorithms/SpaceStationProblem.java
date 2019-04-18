package Algorithms.ArrayAlgorithms;

public class SpaceStationProblem {
    public static void main(String[] args) {
        int c[] = {13, 1, 11, 10, 6};
        System.out.println(flatlandSpaceStations(20, c));
    }

    private static int flatlandSpaceStations(int n, int[] c) {
        int[] arr = new int[n];
        int max_length = 0;
        if (n == c.length) {
            return 0;
        }
        for (int i = 0; i < c.length; i++) {
            arr[c[i]] = 1;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                continue;
            }
            int left_distance = 0;
            int right_distance = 0;
            boolean left_present = false;
            boolean right_present = false;
            //calculate left distance
            int j = i;
            while (j >= 0 && arr[j] != 1) {
                left_distance++;
                j--;
            }
            if (j < 0) {
                j++;
            }
            if (arr[j] == 1) {
                left_present = true;
            }
            //calculate right distance
            int k = i;
            while (k < n && arr[k] != 1) {
                right_distance++;
                k++;
            }
            if (k == n) {
                k--;
            }
            if (arr[k] == 1) {
                right_present = true;
            }
            int temp_max;
            if (left_present && right_present) {
                temp_max = Math.min(left_distance, right_distance);
            } else if (left_present) {
                temp_max = left_distance;
            } else {
                temp_max = right_distance;
            }
            max_length = Math.max(max_length, temp_max);// max_length > temp_max ? max_length : temp_max;
        }
        return max_length;
    }
}
