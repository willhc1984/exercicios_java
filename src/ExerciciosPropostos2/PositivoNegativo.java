package ExerciciosPropostos2;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		
		int num = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite um numero:");			
			num = sc.nextInt();
			if(num >= 0) {
				System.out.println("Numero não negativo.");
			}else {
				System.out.println("Numero negativo.");
			}
		}catch (Exception e) {
			System.out.println("Numero invalido!");
		}
		

	}

}
