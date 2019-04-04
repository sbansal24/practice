package DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw(String fillColors) {
        shapes.forEach(shape -> shape.draw(fillColors));
    }

    public void add(Shape shape){
        shapes.add(shape);
    }
}
