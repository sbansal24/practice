package Algorithms.ArrayAlgorithms;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int chocolates[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;
        Arrays.sort(chocolates);
        int minimumDifference = Integer.MAX_VALUE;
        int first = 0, last = 0;
        Arrays.stream(chocolates).forEach(result->System.out.print(result + " "));
        System.out.println();
        for (int i = 0; i + m - 1 < chocolates.length; i++) {
            if ((chocolates[i + m - 1] - chocolates[i]) < minimumDifference) {
                minimumDifference = chocolates[i + m - 1] - chocolates[i];
                first = i;
                last = i + m - 1;
            }
        }
        System.out.println(chocolates[last] - chocolates[first]);
    }
}
