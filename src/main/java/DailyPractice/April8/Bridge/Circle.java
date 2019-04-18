package DailyPractice.April8.Bridge;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.println("Circle filled with the color");
        color.applyColor();
    }
}
