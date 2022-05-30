package ExerciciosPropostos3;

import java.util.Scanner;

public class LerSenha {

	public static void main(String[] args) {
		
		int senha = 2002;
		
		System.out.println("Digite a senha:");
		Scanner sc = new Scanner(System.in);
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha incorreta. Digite novamente:");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido.");
		sc.close();

	}

}
