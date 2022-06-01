package ExerciciosPropostos6;

import java.util.Scanner;

public class ExecutavelProduct {

	public static void main(String[] args) {
		
		Product product = new Product();
		Scanner sc = new Scanner(System.in);
		int quantity;
		
		product.setName("TV");
		product.setPrice(900.00);
		product.setQuantity(10);
		
		System.out.println("Product data:");
		System.out.println(product);
		System.out.println("Total: " + product.totalValueInStock());
		
		System.out.println("Enter the number of products to be added in stock:");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Product data:");
		System.out.println(product);
		System.out.println("Total: " + product.totalValueInStock());
		
		System.out.println("Enter the number of products to be removed from stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Product data:");
		System.out.println(product);
		System.out.println("Total: " + product.totalValueInStock());
		
	}

}
