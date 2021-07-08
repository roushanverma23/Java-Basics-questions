import java.util.*;
public class Q1 {
    public static void main(String args[]) {
        int rv;
        do {
            Scanner sc= new Scanner(System.in);	 // scanner class
            System.out.println("enter a number"); // take input from user

            int n=sc.nextInt(); // input variable
            int unit=0;		// unit place variable
            int coeff=0; 	// coefficient variable
            unit= n%10;
            coeff++;
            int num1=n/10;
            if(num1!=0) {
                int tens=num1%10;
                coeff++;
                System.out.println("tens digit of numberis"+tens);
            }
            System.out.println("the unit digit no is" +unit);
            System.out.println("the no of coeff=" +coeff);

            if(n>0) {
                System.out.println("the no. is positive");
            }
            else {
                System.out.println("the number is negative");
            }

            if(n%2==0) {
                System.out.println("no is even");
            }
            else {
                System.out.println("no. is odd");
            }

            System.out.println("press 1 to continue");
            rv=sc.nextInt();
        }
        while(rv==1);
    }
}
