package interface_comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program2 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\temp\\in2.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeeCsv = br.readLine();
			while(employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for(Employee s : list) {
				System.out.println(s.getName() + " - " + s.getSalary());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
