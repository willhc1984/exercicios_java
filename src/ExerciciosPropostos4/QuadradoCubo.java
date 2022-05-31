package ExerciciosPropostos4;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Digite um numero:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
			System.out.println(i*i);
			System.out.println(i*i*i);
		}

	}

}
