package DailyPractice.March12;

public class Test {
    public static void main(String[] args) {
        Ballon red = new Ballon("red");
        Ballon green = new Ballon("green");
        swap(red, green);
        System.out.println(red.getColor());
        System.out.println(green.getColor());
    }

    private static void swap(Ballon red, Ballon green) {
        Ballon temp = red;
        red = green;
        green = temp;
    }
}
