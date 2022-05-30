package ExerciciosPropostos2;

import java.util.Scanner;

public class QuantiaPagar {

	public static void main(String[] args) {
		
		int codigo;
		int qtde;
		double preco;
		double total;
		
		System.out.println("Digite o codigo do produto:");
		Scanner sc = new Scanner(System.in);
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade de itens:");
		qtde = sc.nextInt();
		
		if(codigo == 1) {
			total = qtde* 4.00;
		}else if(codigo == 2){
			total = qtde * 4.50;
		}else if(codigo == 3) {
			total = qtde * 5.00;
		}else if(codigo == 4) {
			total = qtde * 2.0;
		}else {
			total = qtde * 1.50;
		}
		
		System.out.printf("Total a pagr: %.2f", total);

	}

}
