import java.util.Scanner;

public class produto_diferenca {

	public static void main(String[] args) {
		
		int a,b,c,d,result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de a:");
		a = sc.nextInt();
		System.out.println("Digite o valor de b:");
		b = sc.nextInt();
		System.out.println("Digite o valor de c:");
		c = sc.nextInt();
		System.out.println("Digite o valor de d:");
		d = sc.nextInt();
		
		result = a*b - c*d;
			
		
		System.out.println("O Resultado é " + result);
		

	}

}
