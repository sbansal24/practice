package DailyPractice.April5.CompositePattern;

public class Circle implements Shape {
    @Override
    public void draw(String fillColors) {
        System.out.println("filling color in circle: "+fillColors);
    }
}
