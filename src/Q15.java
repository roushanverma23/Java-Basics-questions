import java.util.*;
public class Q15 {
    static int RoomConstructor(int i, int w) {
        return i * w; }

    static double RoomConstructor(double i, double w) {
        return i *w;
    }
    public static void main(String[] args) {
        int mynum1 = RoomConstructor(2,5);
        double mynum2 = RoomConstructor(1.1,5.9);
        System.out.println("int: "+ mynum1);
        System.out.println("double: "+ mynum2);
    }
}
