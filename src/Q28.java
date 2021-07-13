import java.util.*;
import java.util.regex.Pattern;

class Employee {
    private String employeeId;
    private String employeeName;
    private String employeeDepartment;
    private String employeeCity;
    private double employeeSalary;

    /**
     * @param employeeId         Only in format EMP with M=manager, S=supervisor, A=analyst, C=clerk with 4 digit number
     * @param employeeName       name
     * @param employeeDepartment department
     * @param employeeCity       City
     * @param employeeSalary     salary
     */
    public Employee(String employeeId, String employeeName, String employeeDepartment, String employeeCity, double employeeSalary) {
        this.employeeId = checkEmployeeId(employeeId.toUpperCase());
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeCity = employeeCity;
        this.employeeSalary = employeeSalary;
    }

    public void calculateSalary() {
        var total_salary = 0.0;
        var HRA = (this.employeeCity.toLowerCase().equals("metro")) ? 30 : 20;
        var da = getDA(employeeId);
        if (da != 0) {
            total_salary = (employeeSalary - (employeeSalary * ((double) HRA / 100))
                    + (employeeSalary * ((double) da / 100))
            );
            System.out.println(total_salary);
        }
    }

    private int getDA(String employeeId) {
        var patterM = ".{3}M.{4}";
        var patterS = ".{3}S.{4}";
        var patterA = ".{3}A.{4}";
        var patterC = ".{3}C.{4}";
        if (Pattern.matches(patterM, employeeId)) return 120;
        if (Pattern.matches(patterS, employeeId)) return 110;
        if (Pattern.matches(patterA, employeeId)) return 100;
        if (Pattern.matches(patterC, employeeId)) return 90;
        return 0;
    }

    private String checkEmployeeId(String employeeId) {
        try {
            if (Pattern.matches("EMP[MSAC]\\d{4}", employeeId))
                return employeeId;
            else throw new WrongEmployeeException("Pattern don't not match ..");
        } catch (WrongEmployeeException exception) {
            exception.printStackTrace();
            return "";
        }
    }
}


public class Q28 {
    public static void main(String[] args) {
        var emp = new Employee("EMPM1234", "Nilay", "X", "metro", 2000);
        emp.calculateSalary();
    }
}

class WrongEmployeeException extends Exception {
    public WrongEmployeeException(String message) {

    }
}
