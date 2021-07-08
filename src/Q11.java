import java.util.*;
public class Q11 {
    public static void main(String args[]){

        int rv;
        do {
            int m, n, c,k,i,j,d,choice;
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the number of rows and columns of matrix");
            m = in.nextInt();
            n = in.nextInt();

            int first[][] = new int[m][n];
            int second[][] = new int[m][n];
            int subtract[][] = new int[m][n];
            int sum[][] = new int[m][n];
            int mul[][] = new int[m][n];

            System.out.println("Enter the elements of first matrix");

            for (  c = 0 ; c < m ; c++ )
                for ( d = 0 ; d < n ; d++ )
                {
                    System.out.print(c+""+d+" Element : ");
                    first[c][d] = in.nextInt();
                }

            System.out.println("Enter the elements of second matrix");

            for ( c = 0 ; c < m ; c++ )
                for ( d = 0 ; d < n ; d++ )
                {
                    System.out.print(c+""+d+" Element : ");
                    second[c][d] = in.nextInt();
                }

            System.out.println("1 to add two matrix");
            System.out.println("2 to subtract two matrix");
            System.out.println("3 to multiply two matrix");
            System.out.println("enter your choice");
            choice= in.nextInt();

            switch(choice) {

                case 1:


                    //--------Add two matrix-----------------------------------

                    for ( c = 0 ; c < m ; c++ )
                        for ( d = 0 ; d < n ; d++ )
                            sum[c][d] = first[c][d] + second[c][d];

                    System.out.println("Sum of entered matrices:-");

                    for ( c = 0 ; c < m ; c++ )
                    {
                        for ( d = 0 ; d < n ; d++ )
                            System.out.print(sum[c][d]+"\t");

                        System.out.println();
                    }

                    //-------end add matrix----------

                    break;

                case 2:

                    //--------Subtract two matrix-----------------------------------

                    for ( c = 0 ; c < m ; c++ )
                        for ( d = 0 ; d < n ; d++ )
                            subtract[c][d] = first[c][d] - second[c][d];

                    System.out.println("Subtraction of entered matrices:-");

                    for ( c = 0 ; c < m ; c++ )
                    {
                        for ( d = 0 ; d < n ; d++ )
                            System.out.print(subtract[c][d]+"\t");

                        System.out.println();
                    }
                    //---------end subtract matrix---------

                    break;

                case 3:
                    //----------------Multiplication-------------------------------------------


                    for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                            mul[i][j]=0;

                            for( k=0;k<n;k++)
                            {
                                mul[i][j] = mul[i][j] + first[i][k]*second[k][j];
                            }
                        }
                    }

                    //-------------Display_multiplication_matrix--------------------------------

                    System.out.println("Multiplication of matrices are:: ");
                    for(i=0;i<m;i++)
                    {
                        for(j=0;j<n;j++)
                        {
                            System.out.print(" "+mul[i][j]);

                        }
                        System.out.println(" ");
                    }

                    break;

                //------end multiplication-------


                default: System.out.println("wrong choice enterd"); break;
            }

            System.out.println("want to continue press 1");
            rv=in.nextInt();

        }  // end do-while loop

        while(rv==1);
    }

}
