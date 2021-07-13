import java.util.*;
public class Q29 {
    public static void main(String[] args) {
//        28
        question29();
    }
    private static void question29() {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) System.out.println("In t1");
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) System.out.println("In t2");
        });
        Thread t3 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) System.out.println("In t3");
        });
        Thread t4 = new Thread(() -> {
            for (int i = 0; i <= 10; i++) System.out.println("In t3");
        });
        try {
            t1.run();
            Thread.sleep(100);
            t2.run();
            Thread.sleep(100);
            t3.run();
            Thread.sleep(100);
            t4.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
