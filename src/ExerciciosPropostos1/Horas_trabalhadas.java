package ExerciciosPropostos1;
import java.util.Scanner;

public class Horas_trabalhadas {

	public static void main(String[] args) {
		
		int num_func;
		double horas_trabalhadas;
		double valor_hora;
		double result;
		
		System.out.println("Digite o numero do fucionario:");
		Scanner sc = new Scanner(System.in);
		num_func = sc.nextInt();
		System.out.println("Digite as horas trabalhadas:");
		horas_trabalhadas = sc.nextDouble();
		System.out.println("Digite o valor/hora trabalhada:");
		valor_hora = sc.nextDouble();
		
		result = horas_trabalhadas * valor_hora;
		
		System.out.printf("O salario do funcionario %s é %.2f", num_func, result);

	}

}
