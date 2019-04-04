package General;

public class PrintLeader {
    public static void main(String[] args) {
        int[] array = {16, 19, 4, 3, 8, 3};
        for (int i = 0; i < array.length; i++) {
            boolean leader = true;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] >= array[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                System.out.println(array[i]);
            }
        }
    }
}
