package exercicio_Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the file path");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFileStr + "\\out\\";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				products.add(new Product(name, price, quantity));
				itemCsv = br.readLine();
				}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				for(Product p : products) {
					bw.write(p.getName() + "," + String.format("%.2f", p.total()));
					bw.newLine();
				}
				System.out.println(targetFileStr + " CREATED!");
			}catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}
		
		}catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}

}
