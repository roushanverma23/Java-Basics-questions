import java.util.*;
public class Q16 {
    private int rno;
    private String name;
    private String VIEW = "Q16";
    private int VIEW2= 16;

//  Empty Constructor

    public Q16() {
        System.out.println("Empty constructor called");
    }

//  parameterized Constructor

    public Q16(String pr1, int pr2) {
        System.out.println("parameterize constructor called");
        this.VIEW = pr1;
        this.VIEW2 = pr2;
    }

    //constructor to initialize roll number and name of the student

    Q16 (int Rno, String Name){
        rno = Rno; name = Name;
    }

    //creating a copy constructor

    Q16 (Q16 S) {
        System.out.println("\nAfter invoking the Copy Constructor:\n");
        rno = S.rno;
        name = S.name;
    }
    //creating a method that returns the roll no


    int showrollno ()
    {
        return rno;
    }

    //creating a method that returns the name

    String showName() {
        return name;
    }
    //class to create student object and print roll number and name of the student

    public static void main(String args[]) {

        //empty
        Q16 r1 = new Q16 ();

        //parameter
        Q16 r2 = new Q16 ("roushan",11);
        Q16 S1 = new Q16 (11,"roushan");
        //passing the parameters to the copy constructor


        Q16 S2 = new Q16 (S1);
        System.out.println("Name of the second student: "+ S2.showName());
        System.out.println("roll no of the second student: "+ S2.showrollno());
    }
}
