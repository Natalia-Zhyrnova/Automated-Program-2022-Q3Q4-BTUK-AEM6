package task.OOP.task2;

public class Circle extends Round {

    private final float r;

    public Circle(float r) {

        this.r = r;
    }

    @Override
    public float getSquare() {

        return (float) (Math.PI * r * r);
    }
}
