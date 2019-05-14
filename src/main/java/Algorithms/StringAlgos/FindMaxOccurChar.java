package Algorithms.StringAlgos;

public class FindMaxOccurChar {
    public static void main(String[] args) {
        String str = "aaaabbcbbbbb";
        char prev = str.charAt(0);
        char result = str.charAt(0);
        int max_occur = 1;
        int max = 0;
        for(int i = 1; i<str.length();i++){
//            max_occur = prev == str.charAt(i) ? max_occur++:1;
            if(prev == str.charAt(i)){
                max_occur++;
            } else{
                max_occur = 1;
            }
            if(max_occur>max){
                max = max_occur;
                result = str.charAt(i);
            }
            prev = str.charAt(i);
//            max = Math.max(max, max_occur);
        }
        System.out.println(result);
        System.out.println(max);
    }
}
