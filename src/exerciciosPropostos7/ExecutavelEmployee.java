package exerciciosPropostos7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecutavelEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		List<Employee> employees = new ArrayList<>();
		System.out.print("How many employee will be registered? ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print("Employee id: ");
			int id = sc.nextInt();
			
			while(hasId(employees, id)) {
				System.out.println("Id already taken! Try again. ");
				id = sc.nextInt();
			}
			
			System.out.print("Employee name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Employee salary: ");
			double salary = sc.nextDouble();
			Employee employee = new Employee(id, name, salary);
			employees.add(employee);
		}
		
		System.out.println("List of employees");
		for(Employee emp : employees) {
			System.out.println(emp.getId() +" - " + emp.getName() + ", " + emp.getSalary());
		}
		
		System.out.print("Enter the employee id will have salary increase: ");
		int id = sc.nextInt();
		
		Employee emp = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			int percentage = sc.nextInt();
			emp.increaseSalary(percentage);
		}
		
//		for(Employee emp : employees) {
//			if(emp.getId() == id) {
//				System.out.print("Enter the percentage: ");
//				int percentage = sc.nextInt();
//				emp.increaseSalary(percentage);
//			}else {
//				System.out.println("Employee id does not exist.");
//			}			
//		}
		
		System.out.println("List of employees");
		for(Employee employee : employees) {
			System.out.println(employee.getId() +" - " + employee.getName() + ", " + employee.getSalary());
		}
		
		
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
