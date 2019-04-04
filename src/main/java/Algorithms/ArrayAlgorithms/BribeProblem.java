package Algorithms.ArrayAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BribeProblem<T> {
    public static void main(String[] args) {
        int q[] = {5, 1, 2, 3, 7, 8, 6, 4};
        int bribes = 0;
        for(int i = q.length-1; i>=0; i--){
            if((q[i]-(i+1))>2){
                System.out.println("Too chaotic");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++)
                if (q[j] > q[i]) bribes++;
        }
        System.out.println(bribes);
    }
}
