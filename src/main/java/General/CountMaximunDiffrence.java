package General;

public class CountMaximunDiffrence {

    public static void main(String[] args) {
        int[] array = {2,4,3,10,6,9};
        int maxDifference = 0;
        int previousNumber = array[0];
        for(int i= 1; i< array.length; i++){
            if(previousNumber <= array[i] && (array[i]-previousNumber) > maxDifference){
                maxDifference = array[i]-previousNumber;
            } else{
                previousNumber = array[i];
            }
        }
        System.out.println(maxDifference);
    }
}
