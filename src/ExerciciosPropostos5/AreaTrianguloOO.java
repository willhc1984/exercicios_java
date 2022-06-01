package ExerciciosPropostos5;

import java.util.Scanner;

public class AreaTrianguloOO {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		System.out.println("Digite as medidas do triangulo 1:");
		Scanner sc = new Scanner(System.in);
		t1.a = sc.nextDouble();
		t1.b = sc.nextDouble();
		t1.c = sc.nextDouble();
		
		System.out.println("Digite as medidas do triangulo 2:");
		t2.a = sc.nextDouble();
		t2.b = sc.nextDouble();
		t2.c = sc.nextDouble();
		
		double p = (t1.a + t1.b + t1.c) / 2.0;
		double area1 = Math.sqrt(p * (p - t1.a) * (p - t1.b) * (p - t1.c));
		
		p = (t2.a + t2.b + t2.c) / 2.0;
		double area2 = Math.sqrt(p * (p - t2.a) * (p - t2.b) * (p - t2.c));
		
		System.out.printf("A area do triangulo 1 é %.4f \n", area1);
		System.out.printf("A area do triangulo 2 é %.4f \n", area2);
		
		if(area1 > area2) {
			System.out.println("Triangulo 1 é o maior.");
		}
		else {
			System.out.println("Triangulo 2 é o maior.");
		}

	}
	
	

}
