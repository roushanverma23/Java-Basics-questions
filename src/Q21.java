import java.util.*;
public class Q21 {
    public static void main(String args[])
    {
        int rv;
        do {
            int n, i, j, space = 1;
            System.out.print("Enter the number of rows: ");
            Scanner s = new Scanner(System.in);
            n = s.nextInt();
            space = n - 1;
            for (j = 1; j<= n; j++)
            {
                for (i = 1; i<= space; i++)
                {
                    System.out.print(" ");
                }
                space--;
                for (i = 1; i <= 2 * j - 1; i++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            space = 1;
            for (j = 1; j<= n - 1; j++)
            {
                for (i = 1; i<= space; i++)
                {
                    System.out.print(" ");
                }
                space++;
                for (i = 1; i<= 2 * (n - j) - 1; i++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }

            System.out.println("want to continue press 1");
            rv=s.nextInt();
        }
        while(rv==1);

    }
}
