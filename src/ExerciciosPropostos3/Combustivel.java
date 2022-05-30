package ExerciciosPropostos3;

import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		
		int combustivel = 0; 
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		
		while(combustivel < 4) {	
			System.out.println("Digite o 1 para alcool, 2 para gasolina e 3 para diesel:");
			Scanner sc = new Scanner(System.in);
			combustivel = sc.nextInt();	
			
			if(combustivel == 1) alcool+=1;
			if(combustivel == 2) gasolina+=1;
			if(combustivel == 3) diesel+=1;
		}
		
		System.out.printf("%d clientes abasteceram com alcool: \n ", alcool );
		System.out.printf("%d clientes abasteceram com gasolina: \n ", gasolina );
		System.out.printf("%d clientes abasteceram com diesel: \n ", diesel );
		

	
	}
}
