package General;

import static java.lang.Math.max;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int array[] = {1, 1, -4, 10, -2, 3, -1, 40};
        int sum = 0;
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            if (sum + array[i] > 0) {
                sum += array[i];
            } else {
                sum = 0;
            }
            result = max(result, sum);
        }
        System.out.println(result);
    }
}
