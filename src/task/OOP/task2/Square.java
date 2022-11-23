package task.OOP.task2;

public class Square extends Rectangular {

    private final float h;

    public Square(float h) {
        this.h = h;
    }

    @Override
    public float getSquare() {
        return h * h;
    }
}
