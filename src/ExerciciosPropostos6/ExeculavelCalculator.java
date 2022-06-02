package ExerciciosPropostos6;

import java.util.Scanner;

public class ExeculavelCalculator {

	public static void main(String[] args) {
		
		double radius;
		System.out.println("Enter radius: ");
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circunference: %.2f \n", c);
		System.out.printf("Volume: %.2f \n", v);
		System.out.printf("PI value: %.2f \n",  Calculator.PI);

	}

}
