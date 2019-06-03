package Algorithms.HashBasedAlgos;

import java.util.HashSet;
//pair to find multiplier
public class FindMultiplier {
    public static void main(String[] args) {
        int arr[] = {2, 1, 4, 6, 8, 5, 40, -1};
        int multiplier = 20;
        HashSet<Integer> set = new HashSet<>();
        int pair = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (multiplier % arr[i] == 0) {
                set.add(arr[i]);
                int remainder = multiplier/arr[i];
                if(set.contains(remainder)){
                    pair = remainder;
                    break;
                }
            }
        }
        System.out.println("pair is :"+arr[i] +" and "+pair);
    }
}
