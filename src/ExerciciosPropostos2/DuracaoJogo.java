package ExerciciosPropostos2;

import java.util.Scanner;

public class DuracaoJogo {

	public static void main(String[] args) {
		
		int hora_inicial;
		int hora_final;
		int duracao;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a hora inicial:");
		hora_inicial = sc.nextInt();
		System.out.println("Digite a hora final:");
		hora_final = sc.nextInt();
		
		if(hora_inicial < hora_final) {
			duracao = hora_final - hora_inicial;
		}else {
			duracao = 24 - hora_inicial + hora_final;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s).");
		

	}

}
