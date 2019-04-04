package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        FunctionInterface inter = (a, b) -> (a + b);
        List<Integer> list = new ArrayList<>();
        Stream<Integer> integerStream = list.stream().filter(number -> number > 10);
        list = integerStream.collect(Collectors.toList());
        for (Integer number : list) {

        }

        Bound<A> b1 = new Bound<>(new A());
        Bound<B> b2 = new Bound<>(new B());
    }
}


class A {
    public void displayClass()
    {
        System.out.println("Inside class A");
    }
}

class B extends A{
    public void displayClass()
    {
        System.out.println("Inside class B");
    }
}

class Bound<T>
{

    private T objRef;

    public Bound(T obj){
        this.objRef = obj;
    }

}