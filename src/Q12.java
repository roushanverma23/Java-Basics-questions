import java.io.IOException;
import java.util.*;
public class Q12 {
    public static void main(String[] args) throws IOException {

        String[] s;
        String str;
        int word=0,count=0,choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        str = sc.nextLine();

        System.out.println("1 to count words");
        System.out.println("2 to count character");
        choice=sc.nextInt();

        switch(choice) {
            case 1:



                s = str.split(" ");
                for (String item : s) {
                    word++;

                }

                System.out.println("word= "+ word);

                break;

            case 2:

                for (int i =0; i<str.length(); i++) {

                    if(str.charAt(i)!=' '){
                        count++ ;
                    }
                } System.out.println("number of characters in a sentence are "+count);


                break;

            default: System.out.println("wrong choice enterd ");
        }


    }
}
