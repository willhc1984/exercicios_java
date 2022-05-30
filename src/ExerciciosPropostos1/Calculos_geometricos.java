package ExerciciosPropostos1;
import java.util.Scanner;

public class Calculos_geometricos {

	public static void main(String[] args) {

		double a,b,c,triangulo,retangulo,circulo,trapezio,quadrado;
		
		System.out.println("Digite o valor para a:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		System.out.println("Digite o valor para b:");
		b = sc.nextDouble();
		System.out.println("Digite o valor para c");
		c = sc.nextDouble();
		
		triangulo = a*c/2;
		System.out.printf("A area do triangulo é %.3f \n", triangulo);
		circulo = 3.14159*Math.pow(c, 2);
		System.out.printf("A area do circulo de raio C é %.3f \n", circulo);
		trapezio = ((a + b) * c) / 2;
		System.out.printf("A area do trapezio é %.3f \n", trapezio);
		quadrado = Math.pow(b, 2);
		System.out.printf("O quadrado de b é %.3f \n", quadrado);
		retangulo = a*b;
		System.out.printf("A area do retangulo é %.3f \n", retangulo);

	}

}
