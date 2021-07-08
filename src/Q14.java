import java.util.*;
public class Q14 {
    public static void main(String[] args) {
        try{
            int a[]=new int[10];
            a[10]=55/0;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e){

            System.out.println("FIRST ---r");

        }
        System.out.println("OTHER code");
    }

}
