package DailyPractice.April8.Bridge;

//bridge pattern is used when both abstraction & implementation can have different hierarchies independently and we want
//to hide the implementation from the client application.
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape traingle= new Traingle(new RedColor());
        traingle.applyColor();

        Shape circle = new Circle(new GreenColor());
        circle.applyColor();
    }
}
