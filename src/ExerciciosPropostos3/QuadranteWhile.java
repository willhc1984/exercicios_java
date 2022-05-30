package ExerciciosPropostos3;

import java.util.Scanner;

public class QuadranteWhile {

	public static void main(String[] args) {
		
		int x = 10, y = 10;
		
		while(x != 0 && y != 0) {
			
			System.out.println("Digite a coordenada X:");
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			System.out.println("Digite a coordenada Y:");
			y = sc.nextInt();
			
			if(x > 0 && y > 0) {
				System.out.println("Primeiro");
			}
			else if(x > 0 && y < 0) {
				System.out.println("Segundo");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Terceiro");
			}
			else if(x < 0 && y > 0) {
				System.out.println("Quarto");
			}else
			{
				System.out.println("Coordenada 0. Fim!");
			}
		}
		
	}

}
