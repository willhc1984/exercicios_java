package ExerciciosPropostos6;

import java.util.Scanner;

public class ExecutavelStudent {

	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student name: ");
		student.setName(sc.nextLine());
		System.out.println("Grade 1: ");
		student.setGrade1(sc.nextDouble());
		System.out.println("Grade 2: ");
		student.setGrade2(sc.nextDouble());
		System.out.println("Grade 3: ");
		student.setGrade3(sc.nextDouble());
		
		System.out.println("Final grade: " + student.finalGrade());
		if(student.finalGrade() < 60) {
			System.out.println("Failed.");
			System.out.println("Missing " + student.missingPoints() + " points");
		}else {
			System.out.println("Pass!");
		}
		

	}

}
