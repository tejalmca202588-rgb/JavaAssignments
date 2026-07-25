package bankingmanagement;

import java.util.ArrayList;

public class BankManager {

    private ArrayList<String> transactionHistory = new ArrayList<>();

    public void addTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public void displayTransactionHistory() {

        if (transactionHistory.isEmpty()) {
            System.out.println("No Transactions Found.");
            return;
        }

        System.out.println("\nTransaction History");

        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }

    }

}