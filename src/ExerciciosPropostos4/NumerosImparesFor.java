package ExerciciosPropostos4;

import java.util.Scanner;

public class NumerosImparesFor {
	
	public static void main(String args[]) {
		
		int x;
		
		System.out.println("Digite um numero:");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		
		if(x<0 || x>1000) {
			System.out.println("Digite um numero menor ou igual a 1000.");
		}
		else {
			for(int i=0; i<=x; i++) {
				if(i%2 != 0) {
					System.out.println(i);
				}
			}
		}
		
	}
	


}
