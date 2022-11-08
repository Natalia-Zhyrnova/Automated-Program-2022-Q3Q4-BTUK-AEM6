package task.basic.part1;

public class Task_2 {
    public static void main(String[] args) {
        /*
        2.	Write a Java program to print the result of the following operations.
        Test Data:
        a. -5 + 8 * 6
        Expected Output :
        43
        */
        byte x1 = -5, y1 = 8, z1 = 6;
        System.out.println("Result: x1 + y1 * z1 = " + (x1 + y1 * z1));

        /*
        Test Data:
        b. (55+9) % 9
        Expected Output :
        1
        */
        int sum1 = 55 + 9;
        int x2 = 9;
        int modResult = sum1 % x2;
        System.out.println("Result: (55+9) % 9 = " + modResult);

        /*
        Test Data:
        c. 20 + -3*5 / 8
        Expected Output :
        19
        */
        int x3 = 20;
        int sum2 = -3 * 5;
        int y3 = 8;
        int sum3 = sum2 / y3;
        System.out.println("Result: 20 + -3*5 / 8 = " + (x3 + sum3));

        /*
        Test Data:
        d. 5 + 15 / 3 * 2 - 8 % 3
        Expected Output :
        13
        */
        int x4 = 5;
        int sum4 = 15 / 3 * 2;
        x4 += sum4;
        int y4 = 8 % 3;
        System.out.println("Result: 5 + 15 / 3 * 2 - 8 % 3 = " + (x4 - y4));
    }
}

