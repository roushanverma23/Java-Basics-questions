/*WAJP to design a class called account using the inheritance
and static that show the all function of bank
(withDrawal and deposite) generate account number dynamically*/

import java.util.Scanner;
// import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

class Account{ // creating account class having detail of the the customer
    public int intialAmount;
    public String name;
    public long accountnumber;
    public int age;
    public String sex;
    public int pin;

    // creating constructor class for assigning values to it
    Account(int intialAmount, String name, long accountnumber, int pin){
        this.intialAmount = intialAmount;
        this.name = name;
        this.accountnumber = accountnumber;
        this.pin = pin;
    }

    void withDrawalMoney(int x){
        if (intialAmount<0) {
            System.out.println("Can't withdrawal because there is zero balance in your account.");
        }
        else{

            if (x>intialAmount) {
                System.out.println("Not sufficient ammount in your account.");
            }
            else{
                intialAmount = intialAmount-x;
                System.out.println("Money has been debited from your bank.");
                System.out.println("\tRs " +x);
                System.out.println("Please Collect your money.");
            }
        }

    }
    void accountDisplay(){
        System.out.println("....User Account Detail.....");
        System.out.println("User : "+name);
        System.out.println("Account number : "+accountnumber);
        System.out.println("Available Balance: "+intialAmount);
        System.out.println("");
    }
    void depositeMoney(int x){
        intialAmount = intialAmount+x;
    }
}
public class Q19 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            int randomaccnumber = ThreadLocalRandom.current().nextInt(500000,600000);
            Account sushant = new Account(50000,"Roushan",randomaccnumber,4545);

            int option;
            // withdrawalmoney,depositeMoney;

            System.out.println("\t\t---------------BANK OF INDIA ---------------");
            System.out.println("\n\tWELCOME TO BANK OF INDIA\n");

            do{
                System.out.println("WELLCOME "+sushant.name);
                System.out.println("1.Withdrawal Money.");
                System.out.println("2.Deposite Money");
                System.out.println("3.Check Status.");
                System.out.println("4.Exit");
                option = input.nextInt();

                switch(option){


                    case 1: System.out.println("Withdrawl Money.");
                        System.out.println("User : "+sushant.name);
                        System.out.println("Available balance: "+sushant.intialAmount);
                        System.out.print("Enter the amount to be withdrawal : ");
                        int withDrawalMoney = input.nextInt();
                        sushant.withDrawalMoney(withDrawalMoney);
                        System.out.println("THANK YOU! VISIT AGAIN");break;

                    case 2:	System.out.print("Ammount to be deposite : ");
                        int depositeMoney = input.nextInt();
                        sushant.depositeMoney(depositeMoney);
                        System.out.println("\nMoney has been successfully credited");
                        System.out.println("THANK YOU! VISIT AGAIN");break;

                    case 3: sushant.accountDisplay();
                        System.out.println("THANK YOU! VISIT AGAIN\n");break;

                    case 4: break;

                    default: System.out.println("Invalid Selection !!");
                        System.out.println("Please select a valid option.");
                        break;
                }
            }while(option!=4);
            input.close();
        }
    }


