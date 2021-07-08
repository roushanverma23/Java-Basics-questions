import java.util.*;
public class Q7 {
    public static void main(String args[]) {
        int rv;
        do {
            Scanner myobj =  new Scanner(System.in);
            System.out.println("enter a no");
            int num=myobj.nextInt();
            System.out.println("Enter no for wich you want to search");
            int digit=myobj.nextInt();
            int extracted=0;
            int counter=0;

            List<Integer> list = new ArrayList<Integer>();
            while(num!=0) {
                extracted=num%10;
                list.add(extracted);
                num=num/10;

            }
            int length=list.size();
            for(int i=0;i<length;i++) {
                if(list.get(i)==digit) {
                    counter++;
                }
            }
            System.out.println("there are " +counter + "occurrences of " +digit);
            System.out.println("press 1 to continue");
            rv=myobj.nextInt();
        }
        while(rv==1);
    }
}
