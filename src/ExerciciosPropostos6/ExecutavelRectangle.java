package ExerciciosPropostos6;

import java.util.Scanner;

public class ExecutavelRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		rectangle.setWidth(sc.nextDouble());
		rectangle.setHeight(sc.nextDouble());
		
		System.out.println("Area = " + rectangle.area());
		System.out.println("Perimeter = " + rectangle.perimeter());
		System.out.println("Diagonal = " + rectangle.diagonal());
		
	}

}
