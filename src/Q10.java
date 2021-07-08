import java.util.*;
public class Q10 {
    public static void main(String args[]){
        int rv;
        do {
            //opening of main
            Scanner sc=new Scanner(System.in);
            int n,i,j,a[][],s;
            //taking user's input.
            System.out.println("How many steps you want to print?");
            n=sc.nextInt();
            s=n-1;
            a=new int[n][n];
            //filling the 2D matrix.
            for(i=0;i<n;i++){
                for(j=0;j<=i;j++)
                    if(j==0 || j==i)
                        a[i][j]=1;
                    else
                        a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
            //displaying the Pascal's Triangle as the output.
            System.out.println("\nOutput:\n");
            for(i=0;i<n;i++)
            {
                for(j=0;j<=s;j++)
                    System.out.print(" ");//printing blank spaces at the beginning of rows

                s--;

                for(j=0;j<=i;j++)
                    System.out.print(a[i][j]+" ");

                System.out.println();
            }
            System.out.println("Want to continue press 1");
            rv=sc.nextInt();
        } //end of while loop
        while(rv==1);
    }// end of main
}
