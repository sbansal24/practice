package DailyPractice.April5.CompositePattern;

import java.util.ArrayList;
import java.util.List;

//this is the composite component containing teh group of leaf component & diff. helper methods , it also implements
//the base component.
public class Drawing implements Shape {
    private List<Shape> list = new ArrayList<>();

    public void addShape(Shape shape){
        list.add(shape);
    }

    public void deleteShape(Shape shape){
        list.remove(shape);
    }
    @Override
    public void draw(String fillColors) {
        list.stream().forEach(shape -> shape.draw(fillColors));
    }
}
