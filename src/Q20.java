import java.util.*;
public class Q20 {

        private static void question20() {
            while (true) {
                System.out.print("Enter your full name :- ");
                var name = new Scanner(System.in).nextLine();
                if (name.equals("0")) System.exit(0);
                var password = new StringBuilder();
                var splitName = returnSplitName(name.toUpperCase());


                var nameToNumber = returnNumber(splitName[0]);
                var nameToLast3Digits = returnLast3DigitOfSurname(splitName);

//        Merging Password
                password.append(nameToNumber).append(nameToLast3Digits);
                System.out.println("Your password to given name is :-\n" + password);
                System.out.println("Press 0 to exit !!!");
            }
        }

        private static String returnLast3DigitOfSurname(String[] name) {
            StringBuilder password = new StringBuilder();
            var pos = 0;
            for (var n : name) {
                if (pos != 0) {
                    var revName = new StringBuilder();
                    for (int i = 1; i <= 3; i++) {
                        revName.append(n.charAt(n.length() - i));
                    }
                    password.append(revName.reverse());
                }
                pos++;
            }
            return password.toString();
        }

        private static String returnNumber(String name) {
            var password = new StringBuilder();
            for (var i : name.toCharArray()) {
                var op = ((int) i - 64);
                if (op >= 10) {
                    var sum = 0;
                    var digits = String.valueOf(op);
                    for (var d : digits.toCharArray()) {
                        sum += Integer.parseInt(String.valueOf(d));
                    }
                    password.append(sum);
                } else {
                    password.append(op);
                }
            }
            return password.reverse().toString();
        }

        private static String[] returnSplitName(String name) {
            return name.split("\\s+");
        }
        public static void main(String[] args) {

            Q20 obj = new Q20();
            obj.question20();

        }
    }

