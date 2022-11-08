package task.basic.part1;

public class Task_4 {
    public static void main(String[] args) {
        /*
        4.	Write a Java program to sum values of an array.
        Test Data:
        [5,6,7,12,-5,32,43]
        Expected Output : 100
        */
        int[] x = {5, 6, 7, 12, -5, 32, 43};
        int sum = 0;

        for (int i = 0; i < x.length;) {
            sum += x[i];
            int b = i++;
            System.out.println(b +", "+ i);
        }

        System.out.println("Sum values of an array [5,6,7,12,-5,32,43] = " + sum);
    }
}
