import java.util.*;
public class Q8 {
    public static void main(String[] args) {
        int rv;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter an angle value In degrees");
            int angle= sc.nextInt();
            double radian=0;
            double sinValue=0;
            double cosValue=0;
            radian= (angle*Math.PI)/180;
            System.out.println("The value of "+angle+" degrees in radian is "+radian);
            sinValue= Math.sin(radian);
            cosValue= Math.cos(radian);
            if((sinValue*sinValue)+(cosValue*cosValue)==1){
                System.out.println("It is proved");
            }
            System.out.println("want to continue press 1");
            rv=sc.nextInt();
        }
        while(rv==1);
    }
}
