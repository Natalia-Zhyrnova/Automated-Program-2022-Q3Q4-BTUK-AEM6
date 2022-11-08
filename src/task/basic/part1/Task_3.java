package task.basic.part1;

public class Task_3 {

    /*
    3.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    (Create a separate method for each operation)
    Test Data:
    Input first number: 125
    Input second number: 24
    Expected Output :
    125 + 24 = 149
    125 - 24 = 101
    125 x 24 = 3000
    125 / 24 = 5
    125 mod 24 = 5
    */
    static int sumMethod(int x, int y) {
        int result = x + y;
        return result;
    }

    static int subtractMethod(int x, int y) {
        int i = x - y;
        return i;
    }

    static int multiplyMethod(int x, int y) {
        int i = x * y;
        return i;
    }

    static int divideMethod(int x, int y) {
        int i = x / y;
        return i;
    }

    static int remainderMethod(int first, int second) {
        int i = first % second;
        return i;
    }

    public static void main(String[] args) {
        int myNum1 = sumMethod(125, 24);
        int myNum2 = subtractMethod(125, 24);
        int myNum3 = multiplyMethod(125, 24);
        int myNum4 = divideMethod(125, 24);
        int myNum5 = remainderMethod(125, 24);
        System.out.println("Result: 125 + 24 = " + myNum1);
        System.out.println("Result: 125 - 24 = " + myNum2);
        System.out.println("Result: 125 x 24 = " + myNum3);
        System.out.println("Result: 125 / 24 = " + myNum4);
        System.out.println("Result: 125 mod 24 = " + myNum5);


    }
}
