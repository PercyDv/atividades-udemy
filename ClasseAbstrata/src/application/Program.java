package application;

import java.util.Scanner;
import entities.*;

public class Program {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter number of tax payers: ");
        int n = kb.nextInt();
        TaxPayer[] taxPayers = new TaxPayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = kb.next().charAt(0);
            System.out.print("Name: ");
            kb.nextLine();
            String name = kb.nextLine();
            System.out.print("Annual income: ");
            double income = kb.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = kb.nextDouble();
                taxPayers[i] = new Individual(name, income, healthExpenditures);
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = kb.nextInt();
                taxPayers[i] = new Company(name, income, numberOfEmployees);
            }
        }
        kb.close();
        System.out.println();
        System.out.println("TAXES PAID:");
        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp : taxPayers) {
            sum += tp.tax();
            System.out.println(tp);
        }
        
        System.out.println("TOTAL TAXES: " + String.format("%.2f", sum));
    }
}
