import java.util.*;
public class Q18 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Person1");
        Officer o1 = new Officer("designation", "bank");
        AdminStaff a1 = new AdminStaff("A+", "pay_band");
        MStaff m1 = new MStaff("Department",
                new MStaff.Casual("3000"),
                new MStaff.Regular("4", "200"));

        e1.printCodeAndName();
        o1.printDestinationAndPayScale();
        a1.printGradeAndPayBand();
        m1.printDepartmentCasualAndRegular();
    }

    private static class Employee {
        private int code;
        private String name;

        public Employee(int code, String name) {
            this.code = code;
            this.name = name;
        }

        public void printCodeAndName() {
            System.out.println("\n\nCode :- " + code + "\nname :- " + name);
        }
    }

    private static class Officer {
        private String designation;
        private String pay_scale;

        public Officer(String designation, String pay_scale) {
            this.designation = designation;
            this.pay_scale = pay_scale;
        }

        public void printDestinationAndPayScale() {
            System.out.println("\n\nDestination :- " + designation + "\nPay Scale :- " + pay_scale);
        }
    }

    private static class AdminStaff {
        private String grade;
        private String pay_band;

        public AdminStaff(String grade, String pay_band) {
            this.grade = grade;
            this.pay_band = pay_band;
        }

        public void printGradeAndPayBand() {
            System.out.println("\n\nGrade :- " + grade + "\nPayBand :- " + pay_band);
        }
    }

    private static class MStaff {
        private String department;
        private Casual casual;
        private Regular regular;

        public MStaff(String department, Casual casual, Regular regular) {
            this.department = department;
            this.casual = casual;
            this.regular = regular;
        }

        public void printDepartmentCasualAndRegular() {
            System.out.println("\n\nDepartment :- " + department);
            System.out.println("Casual Class" +
                    "\n" + casual.printDailyWage() +
                    "\nRegular class \n" +
                    regular.printLevelAndConsolidatePay());
        }

        static class Casual {
            private String daily_wage;

            public Casual(String daily_wage) {
                this.daily_wage = daily_wage;
            }

            public String printDailyWage() {
                return "Daily Wage :- " + daily_wage;
            }
        }

        static class Regular {
            private String level;
            private String consolidated_pay;

            public Regular(String level, String consolidated_pay) {
                this.level = level;
                this.consolidated_pay = consolidated_pay;
            }

            public String printLevelAndConsolidatePay() {
                return "Level :- " + level + "\nConsolidatePay :- " + consolidated_pay;
            }
        }
    }
}
