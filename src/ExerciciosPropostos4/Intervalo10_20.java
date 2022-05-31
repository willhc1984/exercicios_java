package ExerciciosPropostos4;

import java.util.Scanner;

public class Intervalo10_20 {

	public static void main(String[] args) {
		
		int n;
		int in = 0;
		int out = 0;
		
		System.out.println("Digite o valor de N:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			if(i>=10 && i<=20) {
				in++;
			}else {
				out++;
			}
		}
		
		System.out.println(in + " in - " + out + " out");
		

	}

}
