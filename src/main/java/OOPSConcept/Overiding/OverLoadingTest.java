package OOPSConcept.Overiding;

public class OverLoadingTest<V> {
    public <T> void process(T t, V v) {

    }

    public static void main(String[] args) {
        System.out.println("main");
        String str = "aaabbeeerrrrryyyyyz";
        String str1 = "a3b2e3r5y5";
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        stringBuilder.append(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            int nextElement = i + 1;

            if (nextElement >= str.length()) {
                stringBuilder.append(count);
                break;
            }

            if (str.charAt(i) == str.charAt(nextElement)) {
                count++;
                continue;
            }
            stringBuilder.append(count);

            stringBuilder.append(str.charAt(i + 1));
            count = 1;
        }
        System.out.println(stringBuilder.toString());
    }

    static synchronized public void main(String str, String... args) {
        System.out.println("overload main");
    }

    static synchronized public void main1() {

    }
}
