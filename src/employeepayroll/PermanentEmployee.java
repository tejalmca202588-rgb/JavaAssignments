package employeepayroll;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(int empId, String empName, double basicSalary) {
        super(empId, empName, basicSalary);
    }

    @Override
    public double calculateGrossSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;

        return basicSalary + hra + da;
    }

    @Override
    public double calculateNetSalary() {

        double gross = calculateGrossSalary();
        double pf = basicSalary * 0.12;

        return gross - pf;
    }

    @Override
    public void displaySalarySlip() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double pf = basicSalary * 0.12;

        System.out.println("\n===== PERMANENT EMPLOYEE =====");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Basic Salary : " + basicSalary);
        System.out.println("HRA : " + hra);
        System.out.println("DA : " + da);
        System.out.println("PF : " + pf);
        System.out.println("Gross Salary : " + calculateGrossSalary());
        System.out.println("Net Salary : " + calculateNetSalary());
    }
}