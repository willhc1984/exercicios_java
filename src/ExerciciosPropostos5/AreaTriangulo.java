package ExerciciosPropostos5;

import java.util.Scanner;

public class AreaTriangulo {
	
	public static void main(String args[]) {
		
		double xa,xb,xc,area1,area2,ya,yb,yc,px,py;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Triangulo X");
		System.out.println("Digite a medida do lado A:");
		xa = sc.nextDouble();
		System.out.println("Digite a medida do lado B:");
		xb = sc.nextDouble();
		System.out.println("Digite a medida do lado C:");
		xc = sc.nextDouble();
		
		px = (xa+xb+xc)/2;
		area1 = Math.sqrt(px*(px-xa)*(px-xb)*(px-xc));
		
		System.out.println("Triangulo Y");
		System.out.println("Digite a medida do lado A:");
		ya = sc.nextDouble();
		System.out.println("Digite a medida do lado B:");
		yb = sc.nextDouble();
		System.out.println("Digite a medida do lado C:");
		yc = sc.nextDouble();
		
		py = (ya+yb+yc)/2;
		area2 = Math.sqrt(py*(py-ya)*(py-yb)*(py-yc));
		
		System.out.printf("Area do triangulo 1: %.4f \n", area1);
		System.out.printf("Area do triangulo 2: %.4f \n", area2);
		
		if(area1 > area2) {
			System.out.println("Triangulo 1 é o maior.");
		}
		else {
			System.out.println("Triangulo 2 é o maior.");
		}
	}

}
