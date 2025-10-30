package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner kb = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = kb.nextInt();
        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = kb.next().charAt(0);
            System.out.print("Name: ");
            kb.nextLine();
            String name = kb.nextLine();
            System.out.print("Price: ");
            double price = kb.nextDouble();

            if (type == 'i') {
                System.out.print("Customs fee: ");
                double customFee = kb.nextDouble();
                products[i] = new ImportedProduct(name, price, customFee);
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(kb.next());
                products[i] = new UsedProduct(name, price, manufactureDate);
            } else {
                products[i] = new Product(name, price);
            }
        }
        kb.close();
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (int i = 0; i < n; i++) {
            System.out.println(products[i]);
        }
    }
}
