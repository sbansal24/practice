package DailyPractice.April8.Bridge;

public class Traingle extends Shape {
    public Traingle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("traingle filled with color");
        color.applyColor();
    }
}
