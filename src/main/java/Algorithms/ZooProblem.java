package Algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ZooProblem {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3};
        Integer arr2[] = {3, 3, 1};
        Set<Set<Integer>> pairs = new HashSet<>();
        int uniquePair = 0;
        for (int i = 0; i < arr1.length; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(arr1[i]);
            set.add(arr2[i]);
            pairs.add(set);
        }

        System.out.println(pairs);

        int n = 4;
        int totalPairs = n;
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i<=n;i++){
            list.add(i);
        }
        for (int r = 2; r < n; r++) {
            Set<Set<Integer>> possibleSets = possiblePairs(list, n,r);
            System.out.println(possibleSets);
            for(Set<Integer> set : possibleSets){
                for(Set<Integer> pair : pairs){
                    if(!set.containsAll(pair)){
                        totalPairs++;
                        break;
                    }
                }
            }
//            totalPairs +=  factorial(n) / (factorial(n - r) * factorial(r));
        }

        uniquePair = totalPairs-pairs.size();
        System.out.println(totalPairs);
    }

    private static Set<Set<Integer>> possiblePairs(List<Integer> list, int n, int r){

        Set<Set<Integer>> result = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        combinationUtil(list, result,set, 0, n-1, 0, r);
        return result;
    }

    private static void combinationUtil(List<Integer> list, Set<Set<Integer>> result, Set<Integer> set, int start, int end, int index, int r) {
        if (index == r)
        {
            result.add(set);
//            for (int j=0; j<r; j++)
//                System.out.print(data[j]+" ");
//            System.out.println("");
            return;
        }


        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions
        for (int i=start; i<=end && end-i+1 >= r-index; i++)
        {
            set.add(list.get(i));
            combinationUtil(list, result,set, i+1, end, index+1, r);
        }
    }


}
