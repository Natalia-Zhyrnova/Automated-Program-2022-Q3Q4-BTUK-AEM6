package task.OOP.task2;

public abstract class Rectangular implements Shape {

    float h;
    float w;

    Rectangular(float h, float w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public float getSquare() {
        return h * w;
    }
}
