import java.util.*;
public class Q3 {
    public static void main(String args[]) {
        int ans; //initialization of do loop variable
        do {
            System.out.println("enter a no.");
            Scanner sc = new Scanner(System.in);

            int n=sc.nextInt();

            System.out.println("1. To check whether no is prime or not");
            System.out.println("3. Find the factor");
            System.out.println("5. check no odd or even");

            int choice= sc.nextInt();
            int i;

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

                case 3: // factor check begins

                    System.out.print("Factors of " + n + " are: ");

                    // loop runs from 1 to 60
                    for (i = 1; i <= n; ++i) {

                        // if number is divided by i
                        // i is the factor

                        if (n % i == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    break; //factor check end


                case 5: //odd even check start
                    if(n%2==0)
                        System.out.println("no. is even");

                    else
                        System.out.println("no. is odd");
                    break;

                //odd even check end

                default: System.out.println("Wrong choice");

            }
            System.out.println("press 1 to continue else press any key");
            ans=sc.nextInt();
        }
        while(ans==1);
    }
}
