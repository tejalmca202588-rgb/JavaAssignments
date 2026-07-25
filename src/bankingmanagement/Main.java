package bankingmanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account account = null;
        BankManager manager = new BankManager();

        int choice;

        do {

            System.out.println("\n====== BANKING MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Display Balance");
            System.out.println("5. Display Transaction History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                if (account != null) {
                    System.out.println("Account already exists!");
                    break;
                }

                System.out.print("Enter Account Number: ");
                int accNo = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Account Holder Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();

                account = new Account(accNo, name, balance);

                manager.addTransaction("Account Created with Balance: " + balance);

                System.out.println("Account Created Successfully!");

                break;

            case 2:

                if (account == null) {
                    System.out.println("Create an account first.");
                    break;
                }

                System.out.print("Enter Deposit Amount: ");
                double deposit = sc.nextDouble();

                account.deposit(deposit);

                manager.addTransaction("Deposited: " + deposit);

                System.out.println("Amount Deposited Successfully!");

                break;

            case 3:

                if (account == null) {
                    System.out.println("Create an account first.");
                    break;
                }

                System.out.print("Enter Withdraw Amount: ");
                double withdraw = sc.nextDouble();

                try {

                    account.withdraw(withdraw);

                    manager.addTransaction("Withdrawn: " + withdraw);

                    System.out.println("Amount Withdrawn Successfully!");

                } catch (InsufficientBalanceException e) {

                    System.out.println(e.getMessage());

                }

                break;

            case 4:

                if (account == null) {
                    System.out.println("Create an account first.");
                    break;
                }

                System.out.println("\nCurrent Balance: " + account.getBalance());

                break;

            case 5:

                manager.displayTransactionHistory();

                break;

            case 6:

                System.out.println("Thank You!");

                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();

    }

}