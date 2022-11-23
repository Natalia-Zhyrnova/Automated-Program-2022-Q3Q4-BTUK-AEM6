package task.OOP.task2;

public class Oval extends Round {

    private final float r;
    private final float R;

    public Oval(float r, float r1) {
        this.r = r;
        R = r1;
    }

    @Override
    public float getSquare() {
        return (float)(Math.PI * r * R);
    }
}
