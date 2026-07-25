package employeepayroll;

public class ContractEmployee extends Employee {

    public ContractEmployee(int empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }

    @Override
    public double calculateGrossSalary() {

        double hra = basicSalary * 0.10;
        double da = basicSalary * 0.05;

        return basicSalary + hra + da;
    }

    @Override
    public double calculateNetSalary() {

        return calculateGrossSalary();
    }

    @Override
    public void displaySalarySlip() {

        double hra = basicSalary * 0.10;
        double da = basicSalary * 0.05;

        System.out.println("\n===== CONTRACT EMPLOYEE =====");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("PF : 0.0");
        System.out.println("Gross Salary : " + calculateGrossSalary());
        System.out.println("Net Salary : " + calculateNetSalary());
    }
}