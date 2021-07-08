import java.util.*;
public class Q4 {
    public static void main(String args[]) {
        int r;
        do {

            Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
            int num=sc.nextInt();
            String str=Integer.toHexString(num);
            System.out.println("The hex form of the number is " +str);

            System.out.println("want to continue press 1");
            r=sc.nextInt();
        }while(r==1);

    }

}
