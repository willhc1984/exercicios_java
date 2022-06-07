package exercicio_OO_Heranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer # " + i + " data:");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			System.out.print("Individual or company (i/c)?");
			char ch = sc.next().charAt(0);
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				Pessoa pessoaFisica = new PessoaFisica(name, anualIncome, healthExpenditures);
				pessoaFisica.calculoImposto();
				pessoas.add(pessoaFisica);
			}
			else {
				System.out.print("Number of employess: ");
				int employess = sc.nextInt();
				Pessoa pessoaJuridica = new PessoaJuridica(name, anualIncome, employess);
				pessoas.add(pessoaJuridica);
			}
		}
		
		System.out.println();
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getNome() + " - $ " + String.format("%.2f", p.calculoImposto()));
		}
		
		Double sum = 0.0;
		for(Pessoa p : pessoas) {
			sum += p.calculoImposto();
		}
		
		System.out.printf("Total taxes: %.2f", sum);

	}

}
