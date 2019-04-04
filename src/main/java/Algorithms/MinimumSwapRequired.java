package Algorithms;

public class MinimumSwapRequired {
    public static void main(String[] args) {
        int arr[] = {5,1,3,2,4};
//        Arrays.stream(arr).forEach(System.out::println);
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int swaps = 0;
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = i, cycle = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = (arr[j] - 1);
                cycle++;
            }
            if (cycle != 0) {
                swaps = swaps + cycle - 1;
            }
        }
        System.out.println(visited.length);
        return swaps;

    }

}
