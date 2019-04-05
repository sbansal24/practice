package DailyPractice.April5.CompositePattern;

//this is the leaf component who is implementing the base component
public class Traingle implements Shape{

    @Override
    public void draw(String fillColors) {
        System.out.println("filling color in traingle: "+fillColors);
    }
}
