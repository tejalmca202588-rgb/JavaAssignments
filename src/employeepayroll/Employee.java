package employeepayroll;

public class Employee {

    protected int empId;
    protected String empName;
    protected double basicSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public double calculateGrossSalary() {
        return basicSalary;
    }

    public double calculateNetSalary() {
        return basicSalary;
    }

    public void displaySalarySlip() {

        System.out.println("\n========== SALARY SLIP ==========");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary  : " + basicSalary);

    }
}