package ExerciciosPropostos6;

import java.util.Scanner;

public class ExecutavelEmployee {

	public static void main(String[] args) {

		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Employee name: ");
		employee.setName(sc.nextLine());
		System.out.print("Gross Salary: ");
		employee.setGrossSalary(sc.nextDouble());
		System.out.print("Tax: ");
		employee.setTax(sc.nextDouble());
		
		System.out.println("Employee: " + employee.getName() + " R$ " + employee.netSalary());
		System.out.println("Which percentage to increase salary?");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("Updated data: " + employee.getName() + " R$ " + employee.netSalary());

	}

}
