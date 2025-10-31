package model5.application;

import model5.entities.Account;
import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        int number = kb.nextInt();
        kb.nextLine();
        System.out.print("Enter account holder: ");
        String holder = kb.nextLine();
        System.out.print("Is there a initial deposit(y/n)? ");
        char validate = kb.next().toLowerCase().charAt(0);

        if (validate == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = kb.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }
        System.out.println("Updated data: ");
        System.out.println(account);
        System.out.println("Enter a deposit value: ");
        double value = kb.nextDouble();
        account.deposit(value);
        System.out.println("Updated data: ");
        System.out.println(account);
        System.out.println("Updated data: ");
        System.out.println(account);
        System.out.println("Enter a withdraw value: ");
        value = kb.nextDouble();
        account.withdraw(value);
         System.out.println("Updated data: ");
        System.out.println(account);

        kb.close();
    }
}
