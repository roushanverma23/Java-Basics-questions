import java.util.*;
public class Q5 {
    public static void main(String args[]) {
        int rv;
        do {
            Scanner myobj =  new Scanner(System.in);
            System.out.println("enter two no.");
            int num1=myobj.nextInt();
            int num2= myobj.nextInt();
            List<Integer> list1=new ArrayList<Integer>();
            List<Integer> list2=new ArrayList<Integer>();
            int len1=0;
            int len2=0;
            int counter=0;
            for(int i=0;i<=num1;i++) {
                if(num1%i==0) {
                    list1.add(i);
                }
            }
            for(int j=1;j<=num2;j++) {
                if(num2%j==0) {
                    list2.add(j);
                }
            }
            len1=list1.size();
            len2=list2.size();

            for(int k=0;k<len1;k++) {
                for(int m=0;m<len2;m++) {
                    if(list1.get(k)==list2.get(m)) {
                        counter++;
                    }
                }
            }
            if(counter==1) {
                System.out.println("the no are prime to each other");

            }
            else {
                System.out.println("no are not prime to each other");

            }
            int gcd=0;
            int lcm=0;
            for(int a=1;a<num1 && a<=num2;a++) {
                if(num1%a==0 && num2%a==0) {
                    gcd=a;
                }
            }
            lcm=(num1*num2)/gcd;
            System.out.println("the lcm of no is"+lcm);

            System.out.println("want to continue press 1");
            rv=myobj.nextInt();
        }while(rv==1);
    }
}
