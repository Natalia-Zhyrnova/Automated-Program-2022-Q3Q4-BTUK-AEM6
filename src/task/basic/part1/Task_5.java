package task.basic.part1;

public class Task_5 {
    public static void main(String[] args) {
        /*
        5.	Write a Java program to find the duplicate values of an array of integer values.
        Test Data:
        [5,6,7,12,-5,32,43,6,12]
        Expected Output : 6,12
        */
        int[] x = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        for (int i = 0; i < x.length-1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] == x[j]) {
                    System.out.println("Duplicate values of an array = [5,6,7,12,-5,32,43,6,12]" + x[j]);
                }
            }
        }
    }
}
