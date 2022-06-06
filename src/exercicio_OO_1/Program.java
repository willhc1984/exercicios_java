package exercicio_OO_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee employee = null;
		List<Employee> employess = new ArrayList<>();
		
		System.out.print("Enter the number of employess: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee # " +i+ " data:");
			System.out.print("Outsourced? (y/n)");
			char o = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hours: ");
			double valuePerHours = sc.nextDouble();
			
			if(o == 'y'){		
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employee = new OutsourceEmployee(name, hours, valuePerHours, additionalCharge);
				employess.add(employee);
			}else {
				employee = new Employee(name, hours, valuePerHours);
				employess.add(employee);
			}
		}
		
		System.out.println("Payments");
		for(Employee e : employess) {
			System.out.println(e.getName() +" - " + e.payment());
		}
		
		sc.close();
	}

}
