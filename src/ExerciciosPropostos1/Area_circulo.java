package ExerciciosPropostos1;
import java.util.Scanner;

public class Area_circulo {

	public static void main(String[] args) {

		double pi = 3.14159;
		double area;
		double raio;
		
		System.out.println("Digite o raio do circulo:");
		
		Scanner sc = new Scanner(System.in);
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio,2);
		
		System.out.printf("A area do circulo é %.4f", area);
		

	}

}
