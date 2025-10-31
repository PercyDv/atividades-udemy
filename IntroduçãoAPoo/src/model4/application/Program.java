package model4.application;

import java.util.Locale;
import java.util.Scanner;

import model4.entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Student stu = new Student();

		stu.name = kb.nextLine();
		stu.grade1 = kb.nextDouble();
		stu.grade2 = kb.nextDouble();
		stu.grade3 = kb.nextDouble();
		
		System.out.println(stu.name);
		System.out.println(stu.grade1);
		System.out.println(stu.grade2);
		System.out.println(stu.grade3);
		System.out.println();
		System.out.println("FINAL GRADE = "+stu.finalGrade());

		if (stu.finalGrade() > 60.0) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS",stu.missingPoints());
		}
		
		kb.close();
	}

}
