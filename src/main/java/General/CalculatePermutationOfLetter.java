package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatePermutationOfLetter {
    public static void main(String[] args) {
        String[] array = {"abc","def", "gyih","jkl", "mon", "pqr", "stu", "vwxz"};
        String myLetter = "neha";
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<myLetter.length();i++){
            char letter1 = myLetter.charAt(i);
            Arrays.stream(array).forEach(letter -> {
                int index = letter.indexOf(letter1);
                if(index != -1){
                    list.add(++index);
                }
            });
        }
        list.forEach(System.out::println);
        Integer reduce = list.stream().reduce(1,Math::multiplyExact);
        System.out.println(reduce);

    }
}
