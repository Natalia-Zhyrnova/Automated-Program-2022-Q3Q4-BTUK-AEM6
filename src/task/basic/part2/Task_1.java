package task.basic.part2;

public class Task_1 {
    // 1.	Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
    //Test Data:
    //String 1: PHP Exercises and
    //String 2: Python Exercises
    //Expected output:
    //The concatenated string with replacements: H Exercises and ython Exercises
    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and ";
        String str2 = "Python Exercises";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        String str3 = str1.concat(str2);
        String str4 = str3.replace("P", "");
        System.out.println("The concatenated string: " + str4);
    }
}