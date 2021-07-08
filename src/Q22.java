import java.util.*;
public class Q22 {
    public static void count(String str) {
        int count=0;
        for (int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is "+count);

    }
    public static void main(String args[])
    {
        String str1, str2;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter any String to delete vowels : ");
        str1 = scan.nextLine();

        System.out.println("\nBefore Removing Vowels, String is : \" "+ str1 +" \" ");
        count(str1);

        str2 = str1.replaceAll("[aeiouAEIOU]", "");

        System.out.println("\nAfter Removing Vowels, String is : \" "+ str2 +" \" ");

    }
}
