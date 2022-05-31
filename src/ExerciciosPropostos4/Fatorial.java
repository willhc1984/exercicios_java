package ExerciciosPropostos4;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		int n, result = 1;
		
		System.out.println("Digite um valor:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		
		System.out.println("O fatorial é: " + result);
	}

}
