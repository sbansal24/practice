package Algorithms.ArrayAlgorithms;

public class IndexInArrayLeftAndRightHasSameNumberOfEvenAndOdd {
    public static void main(String[] args) {
        int arr[] = {4, 8, 2, 1, 2, 4};
        int odd_numbers = 0;
        int even_numbers= 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                even_numbers++;
            } else{
                odd_numbers++;
            }
        }
        int left_even = 0;
        int i ;
        for(i = 0; i<arr.length; i++){
            if(left_even == even_numbers){
                break;
            }
            if(arr[i]%2==0){
                left_even ++;
                even_numbers--;
            } else{
//                if(left_even == even_numbers){
//                    break;
//                }
            }
        }
        System.out.println(i);
    }
}
