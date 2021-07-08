import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter number of elements you want in list");
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Enter numbers to sort");
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<num; i++) {
            int number= sc.nextInt();
            list.add(number);
        }
        Collections.sort(list);
        System.out.println("The sorted list is" +list);
    }
}
