package exerciciosPropostos7;

import java.util.Scanner;

public class RentRoomStudent {

	public static void main(String[] args) {
	
		int number;	
		Student[] vect = new Student[10];  
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will br rented?");
		number = sc.nextInt();
		
		for(int i = 0; i < number; i++) {
			sc.nextLine();
			System.out.print("Student name:");
			String name = sc.nextLine();
			System.out.print("Student email:");
			String email = sc.nextLine();
			System.out.print("Room number:");
			int room = sc.nextInt();
			vect[room] = new Student(name, email, room);
		}
		
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}
		

	}

}
