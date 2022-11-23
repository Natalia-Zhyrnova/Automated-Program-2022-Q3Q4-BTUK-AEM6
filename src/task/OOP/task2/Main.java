package task.OOP.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(
                new Circle(5F),
                new Square(10F)
        );

        for (Shape shape : shapes) {
            System.out.println(shape.getSquare());
        }
    }
}
