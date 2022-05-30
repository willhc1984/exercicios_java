package ExerciciosPropostos2;

import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {

		double salario, result;
		
		System.out.println("Digite o seu salario:");
		Scanner sc = new Scanner(System.in);
		salario = sc.nextDouble();
		
		if(salario > 0.00 && salario <= 2000.00) {
			System.out.println("Isento.");
		}
		else if(salario > 2000.00 && salario  <= 3000.00) {
			result = salario * 0.08;
			System.out.printf("Voce pagara %.2f de imposto", result);
		}
		else if(salario - 2000.00 > 3000.00 && 2000.00  <= 4500.00) {
			result = salario * 0.18;
			System.out.printf("Voce pagara %.2f de imposto", result);
		}
		else if(salario > 4500.00) {
			result = salario * 0.28;
			System.out.printf("Voce pagara %.2f de imposto", result);
		}
		
	}

}
