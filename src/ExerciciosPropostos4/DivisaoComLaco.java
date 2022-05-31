package ExerciciosPropostos4;

import java.util.Scanner;

public class DivisaoComLaco {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Digite o numero de divisões:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			double a,b;
			System.out.println("Digite o primeiro numero");
			a = sc.nextDouble();
			System.out.println("Digite o segundo numero:");
			b = sc.nextDouble();
		
			if(b == 0) {
				System.out.println("Divisão impossivel.");
			}else
			{
				System.out.println(a/b);
			}
		}

	}

}
