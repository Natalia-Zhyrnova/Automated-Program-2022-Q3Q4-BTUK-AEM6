package task.OOP;

import java.util.ArrayList;
import java.util.List;

//a.	Constructor with coordinates as arguments – x, y, z
public class Vector {

    private final double x;
    private final double y;
    private final double z;
    private static List<Vector> randomVectors;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    static void initializeVectors(int vectorCount, int maxLength) {
        randomVectors = new ArrayList<>();
        for (int i=0; i<maxLength; i++) {
            randomVectors.add(new Vector(Math.random() * maxLength, Math.random() * maxLength, Math.random() * maxLength));
        }
    }

    //b.	Method that calculates the length of this 3d vector (formula).
    public double method1() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    static int plusMethod(int x1, int y1) {
        return x1 + y1;
    }

    static double plusMethod(double x1, double y1) {
        return x1 + y1;
    }

    static double plusVectors(Vector v1, Vector v2) {
        return v2.z - v1.z;
    }

    static double plusVectors() {
//        randomVectors
        return 0.1f;
    }

    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 2, 3);
        System.out.println("Length of 3d vector √( x2 + y2 + z2): √( 1 + 4 + 9) = " + vector1.method1());

//d.	Static method that creates an array (or a list) of random vectors.
        //just for test

        ArrayList<Integer> vectors = new ArrayList<Integer>();
        vectors.add(1);
        vectors.add(2);
        vectors.add(3);
        for (int i = 0; i < vectors.size(); i++) {
            int index = (int) (Math.random() * vectors.size());

            System.out.println("Random vector is: " + vectors.get(index));
        }
//e.	Some methods should be overloaded to use random vectors if they are called without arguments.
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("Overload the 'plusMethod' method:");
        System.out.println("1) int: " + myNum1);
        System.out.println("2) double: " + myNum2);
    }
}