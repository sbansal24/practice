package Algorithms;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n  = 9;
        System.out.println(fib(n));
        System.out.println("****************");
        System.out.println(anotherFib(9));
    }

    private static int anotherFib(int n) {
        int prev = 1, postPrev = 0;
        int fib = 0;
        System.out.println(postPrev);
        System.out.println(prev);
        for(int i =2; i<=n;i++){
            System.out.println(prev+postPrev);
            int temp = prev+postPrev;
            postPrev = prev;
            prev = temp;
        }
        return 0;
    }

    private static int fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }

}
