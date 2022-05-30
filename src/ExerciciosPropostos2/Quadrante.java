package ExerciciosPropostos2;

import java.util.Scanner;

public class Quadrante {

	public static void main(String[] args) {
		
		double x,y;
		
		System.out.println("Digite a coordenada X:");
		Scanner sc = new Scanner(System.in);
		x = sc.nextDouble();
		System.out.println("Digite a coordenada Y:");
		y = sc.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}
		else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}
		else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}
		else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}
		else
		{
			System.out.println("Origem");
		}
		
	}

}
