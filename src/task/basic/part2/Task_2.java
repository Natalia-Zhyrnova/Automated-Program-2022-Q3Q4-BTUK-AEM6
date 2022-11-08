package task.basic.part2;

public class Task_2 {
    public static void main(String[] args) {
        Computer Computer1 = new Computer(
                "Apple",
                13.3F,
                33,
                "MacBook");
        Computer Computer2 = new Computer(
                "ASUS",
                15.6F,
                8,
                "Laptop");
        System.out.println(Computer1);
        System.out.println(Computer2);
    }
}
