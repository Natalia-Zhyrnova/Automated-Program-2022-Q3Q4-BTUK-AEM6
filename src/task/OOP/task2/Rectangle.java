package task.OOP.task2;

public class Rectangle extends Rectangular {
    private final float h;
    private final float w;

    public Rectangle(float h, float w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public float getSquare() {
        return (h*w);
    }

}
