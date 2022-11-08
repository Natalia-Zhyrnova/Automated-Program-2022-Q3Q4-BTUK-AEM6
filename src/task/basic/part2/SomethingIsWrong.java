package task.basic.part2;

//3.	What's wrong with the following program? Fix the program called java.basic.part2.SomethingIsWrong.
//    public class java.basic.part2.SomethingIsWrong {
//    public static void main(String[] args) {
//        java.basic.part2.Rectangle myRect;
//        myRect.width = 40;
//        myRect.height = 50;
//        System.out.println("myRect's area is " + myRect.area());
//    }
//}
public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
        }
}
