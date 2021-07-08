import java.util.*;
class Fraction {
    int numerator = 1;
    int denominator = 1;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
public class Q17 {
    public static void main(String[] args) {
        int num, dem;
        System.out.println(" fraction 1");
        System.out.print("Enter numerator :- ");
        num = new Scanner(System.in).nextInt();
        System.out.print("Enter denominator :- ");
        dem = new Scanner(System.in).nextInt();
        Fraction f1 = new Fraction(num, dem);

        System.out.println("fraction 2 ");
        System.out.print("Enter numerator :- ");
        num = new Scanner(System.in).nextInt();
        System.out.print("Enter denominator :- ");
        dem = new Scanner(System.in).nextInt();
        Fraction f2 = new Fraction(num, dem);
        while (true) {
            System.out.print("1. addition");
            System.out.print("2. sub");
            System.out.print("3. mul");
            System.out.print("4. div");
            System.out.print("5. exit");

            var operation = new Scanner(System.in).nextInt();
            switch (operation) {
                case 1 : sumFraction(f1, f2); break;
                case 2 : subFraction(f1, f2);break;
                case 3 : mulFraction(f1, f2);break;
                case 4 :divFraction(f1, f2);break;
                case 5 : System.exit(0);break;
                default : System.out.println("Enter Valid operation number..");break;
            }
        }
    }

    static void sumFraction(Fraction f1, Fraction f2) {
        int den3 = gcd(f1.denominator, f2.denominator);
        // LCM = a * b/GCD
        den3 = (f1.denominator * f2.denominator) / den3;

        int num3 = (f1.numerator) * (den3 / f1.denominator) + (f2.numerator) * (den3 / f2.denominator);
        lowest(den3, num3, printFinalFraction(f1, f2, " + "));
    }

    static void subFraction(Fraction f1, Fraction f2) {
        int den3 = gcd(f1.denominator, f2.denominator);
        // LCM = a * b/GCD
        den3 = (f1.denominator * f2.denominator) / den3;

        int num3 = (f1.numerator) * (den3 / f1.denominator) - (f2.numerator) * (den3 / f2.denominator);
        lowest(den3, num3, printFinalFraction(f1, f2, " - "));
    }

    static void mulFraction(Fraction f1, Fraction f2) {
        int den3 = f1.denominator * f2.denominator;
        int num3 = f1.numerator * f2.numerator;
        lowest(den3, num3, printFinalFraction(f1, f2, " * "));
    }

    static void divFraction(Fraction f1, Fraction f2) {
        int dem3 = f1.denominator * f2.numerator;
        int num3 = f1.numerator * f2.denominator;
        lowest(dem3, num3, printFinalFraction(f1, f2, " ÷ "));
    }


    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static void lowest(int den3, int num3, String message) {
        int common_factor = gcd(num3, den3);
        den3 = den3 / common_factor;
        num3 = num3 / common_factor;
        System.out.println(message + num3 + "/" + den3);
    }

    static String printFinalFraction(Fraction f1, Fraction f2, String m) {
        return f1.numerator + "/" + f1.denominator + m +
                f2.numerator + "/" + f2.denominator + "= ";
    }

}
