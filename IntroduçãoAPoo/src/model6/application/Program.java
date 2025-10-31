package model6.application;

import java.util.Scanner;
import model6.entities.Rent;

public class Program {
    public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		Rent[] rent = new Rent[10]; 
		
		System.out.println("How many rooms will be rented?");
		int qttRoom = kb.nextInt();
		
		for(int i = 1; i<=qttRoom; i++) {
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			kb.nextLine();
			String name = kb.nextLine();
			System.out.print("E-mail: ");
			String email = kb.nextLine();
			System.out.print("Room: ");
			int roomNumber = kb.nextInt();
			
			rent[roomNumber] = new Rent(name, email);  
		}
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i<rent.length; i++) {
			if (rent[i] != null) {
			System.out.println(i+ ": "+rent[i]);
			}
		}
		
		kb.close();
	}
}
