/*22. Write a Patient class which inherits from the Person class. Patient can again be of two types,
indoor and outdoor. The Patient class requires the following:
a)  a variable to store the patient ID for the patient
b)  a variable to store the department of hospital
c)  a variable to store the ward of hospital
d)  a variable to store the patient 's date of joining the hospital
e)  a variable to store the patient 's address
f)   a variable to store the medical fees that the patient pays
g)  constructor methods, which initialize the variables
h)  a method to calculate the medical fees (for both indoor and outdoor patient)
*/

import java.util.Scanner;
import java.util.Date;

class Patient extends Person{
    int patientId;	//Patient Id
    String patientName;	//	Patient Name
    String department;	//department
    int ward;	//ward number
    String address; // address of the patient
    int fees;	// total fees
    int place;	// place such as indoor or outdoor
    String dob;	// date of joining will show the time whenn the patient login



    Patient(int patientID,String patientName, String department, int ward, String address, int place,String dob){
        this.patientId = patientID;
        this.patientName = patientName;
        this.department =department;
        this.ward = ward;
        this.address = address;
        this.place = place;
        this.dob = dob;

    }
    // fuction for calculating fees
    void calculatefees(int x){
        if (x==1) {
            this.fees = 720;
        }
        else if (x==2) {
            this.fees = 520;
        }
        else System.out.println("Please select correct place !");
    }

    // Function for displaying output
    void displayInfo(){
        System.out.println();
        System.out.println("Patient Name : "+this.patientName);
        System.out.println("Patient Id   : "+this.patientId);
        System.out.println("Patient Ward : "+this.ward);
        System.out.println("Total Fees   :"+this.fees);
        System.out.println("Date of Joining : "+this.dob);
    }

    class outdoor {
        int outfees = 420;
    }

    class indoor{
        int infees = 560;
    }

    //Main class start from here //

}

class Person{
    Person sushant;

}

class questoin23{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Date date = new Date();
        Patient patient;

        System.out.print("Enter the Patient ID : ");
        int pId = input.nextInt();

        System.out.print("Enter the Patient Name : ");
        String pName = input.next();

        System.out.print("Enter the Department : ");
        String pDepartment = input.next();

        System.out.print("Enter the yard number : ");
        int pYard = input.nextInt();

        System.out.print("Enter the address : ");
        String paddress = input.next();

        System.out.println("Select the Place : ");
        System.out.println("1.Outdoor.");
        System.out.println("2.Indoor.");
        int place = input.nextInt();

        patient = new Patient(pId,pName,pDepartment,pYard,paddress,place,date.toString());
        patient.calculatefees(place);
        patient.displayInfo();
    }
}