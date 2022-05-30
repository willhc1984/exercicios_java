package ExerciciosPropostos2;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		
		int a,b,teste;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero:");
		a = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		b = sc.nextInt();
		
		if(a%b == 0 || b%a == 0) {
			System.out.println("São multiplos.");
		}else {
			System.out.println("Não são multiplos.");
		}
		
		System.out.println(a%b);
	}

}
