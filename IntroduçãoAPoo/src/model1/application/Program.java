package model1.application;

import java.util.Scanner;
import model1.entities.Rectangle;

public class Program {
    
    public static void main (String [] args) {
        Scanner kb = new Scanner (System.in);
        
        Rectangle rect = new Rectangle();

        System.out.println("Enter Rectangle width and height: ");
        rect.w = kb.nextDouble();
        rect.h = kb.nextDouble();

        System.out.printf("AREA = %.2f%n", rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());

        kb.close();
    }
}