import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int ans; //initialization of do loop variable
        do {
            System.out.println("Enter a no.");
            Scanner sc = new Scanner(System.in); //scanner class
            int n= sc.nextInt();

            System.out.println("press 1 to check prime");
            System.out.println("press 2 to reverse no");
            System.out.println("Please Enter your choice");
            int choice=sc.nextInt();

            int i; //loop variable


            switch(choice) {

                case 1:  // checking prime switch case

                    i=2;
                    while(true)
                    {
                        if(n==1)
                        {
                            System.out.println("Smallest Prime number is 2");
                            break;
                        }
                        if(n%i==0)
                        {
                            break;
                        }
                        else
                        {
                            i++;
                        }
                    }

                    if(n==i)
                    {
                        System.out.println("Prime No.");
                    }
                    else
                    {
                        System.out.println("Not Prime No.");
                    }
                    break;

                case 2:


                    int reverse = 0;  // initialization of reverse variable
                    while(n!= 0)
                    {
                        int remainder = n % 10;
                        reverse = reverse * 10 + remainder;
                        n = n/10;
                    }
                    System.out.println("The reverse of the given number is: " + reverse);
                    break;
                default: System.out.println("wrong choice"); break;
            }
            System.out.println("press 1 to continue else press any key");
            ans=sc.nextInt();
        }
        while(ans==1);

    }
}
