package General;


import java.util.Arrays;

public class ReverseMultipleWordsString {
    public static void main(String[] args) {
        String str = "I love Java Programming";

        String[] strings = str.split(" ");
        String result = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            result += strings[i] + " ";
        }
        System.out.println(result);

        //reverse words as well
        String result1 = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            result1 += reverseString(strings[i]) + " ";
        }
        System.out.println(result1);

        //extract out words, there might be one space or more spaces
        String str1 = "I love  Java    Programming";
        String[] strings1 = str1.split("\\s+");
        Arrays.stream(strings1).forEach(System.out::println);
    }

    private static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =string.length()-1;i>=0;i--){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }
}
