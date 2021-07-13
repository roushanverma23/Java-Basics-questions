import java.util.*;
/*23. WAJP to take a string as password and check whether it contains at least two numbers, 3 alphabets
	and no space in it. If any contrary throw message.
*/

class Q24{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password;
        int countnum = 0,countalph = 0,passlength,countspace = 0;

        System.out.print("Enter password : ");
        password = input.next();

        void passCheck(password){
        for (int i = 0;i<password.length() ;i++ ) {
            char ch = password.charAt(i);
            if(Character.isWhitespace(password.charAt(i))){
                countspace++;
            }
            if (password.charAt(i) >='A' && (password.charAt(i) <='z')){
                countalph++;
            }
            if(password.charAt(i)>=0 && password.charAt(i)<=9) {
                countnum++;
            }
        }

        if (countnum<2 && countalph<3 && countspace>0) {
            System.out.println("Password requirements doesn't match ! ");
        }
        else {
            System.out.println("Password requirements matched.");
        }

        System.out.println("Requirements : ");
        System.out.println("At least 2 number.");
        System.out.println("At least 3 alphabets.");
        System.out.println("And no Space.");
		}
    }
}