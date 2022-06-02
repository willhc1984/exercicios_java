package exerciciosPropostos1;
import java.util.Scanner;

public class Calculo_pecas {

	public static void main(String[] args) {
		
		int cod1,cod2,qtd1,qtd2;
		double valor1,valor2,result;
		
		System.out.println("Digite o codigo da peça 1:");
		Scanner sc = new Scanner(System.in);
		cod1 = sc.nextInt();
		System.out.println("Digite a quantidade de pecas:");
		qtd1 = sc.nextInt();
		System.out.println("Digite o valor unitario:");
		valor1 = sc.nextDouble();
		
		System.out.println("Digite o codigo da peça 2:");
		cod2 = sc.nextInt();
		System.out.println("Digite a quantidade de pecas:");
		qtd2 = sc.nextInt();
		System.out.println("Digite o valor unitario:");
		valor2 = sc.nextDouble();
		
		result = valor1*qtd1 + valor2*qtd2;
		
		System.out.printf("O valor total a ser pago é %.2f", result);
		
		
		

	}

}
