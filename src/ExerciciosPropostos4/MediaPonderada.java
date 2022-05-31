package ExerciciosPropostos4;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		
		int n;
		
		System.out.println("Digite o numero de casos de teste:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			double valor1, valor2, valor3, media;
			System.out.println("Digite o primeiro valor:");
			valor1 = sc.nextDouble();
			System.out.println("Digite o segundo valor:");
			valor2 = sc.nextDouble();
			System.out.println("Digite o terceiro valor:");
			valor3 = sc.nextDouble();
			media = (valor1*2 + valor2*3 + valor3*5) / 10.0;
			
			System.out.printf("A media ponderada é %.1f \n\n", media);
		}
	}

}
