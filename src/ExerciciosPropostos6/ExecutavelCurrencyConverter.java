package ExerciciosPropostos6;

import java.util.Scanner;

public class ExecutavelCurrencyConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("What is the dollar price?");
		double dollarPrice = sc.nextDouble();
		System.out.println("How many dollar will be bought?");
		double amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyCoverter.converter(amount, dollarPrice));

	}

}
