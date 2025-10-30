package application;

import java.util.Scanner;
import entities.Account;
import exception.DomainException;

public class Program {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter account number: ");
        Integer number = kb.nextInt();
        kb.nextLine();
        System.out.print("Enter account holder: ");
        String holder = kb.nextLine();
        System.out.print("Enter initial balance: ");
        Double balance = kb.nextDouble();
        System.out.print("Enter withdraw limit: ");
        Double withdrawLimit = kb.nextDouble();
        System.out.println();
        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount to withdraw: ");
        Double amount = kb.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New Balance: " + String.format("%.2f", account.getBalance()));
        } catch (DomainException e) {
            System.out.println("Withdraw failed: " + e.getMessage());
        }

        kb.close();
    }
}
