package DailyPractice.April5.CompositePattern;

//composite design pattern should be used when the group of objects should behave as the single object.
//composite design pattern should be used when we have to create a tree like structure.
public class CompositePatternTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape traingle = new Traingle();

        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(traingle);
        drawing.draw("blue");
    }
}
