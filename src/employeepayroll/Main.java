package employeepayroll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n====== EMPLOYEE PAYROLL MANAGEMENT SYSTEM ======");
            System.out.println("1. Permanent Employee");
            System.out.println("2. Contract Employee");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Employee ID: ");
                int pId = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String pName = sc.nextLine();

                System.out.print("Enter Basic Salary: ");
                double pSalary = sc.nextDouble();

                Employee permanent = new PermanentEmployee(pId, pName, pSalary);

                permanent.displaySalarySlip();

                break;

            case 2:

                System.out.print("Enter Employee ID: ");
                int cId = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String cName = sc.nextLine();

                System.out.print("Enter Basic Salary: ");
                double cSalary = sc.nextDouble();

                Employee contract = new ContractEmployee(cId, cName, cSalary);

                contract.displaySalarySlip();

                break;

            case 3:

                System.out.println("Thank You!");

                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 3);

        sc.close();
    }
}