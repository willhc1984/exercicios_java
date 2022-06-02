package exerciciosPropostos7;

import java.util.Scanner;

public class ExecutavelBankAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		
		System.out.print("Enter name:");
		String name = sc.nextLine();
		
		System.out.print("Enter account number:");
		int accountNumber = sc.nextInt();
		
		System.out.print("Is there a initial deposit value? (y/n):");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			account = new BankAccount(accountNumber, name, initialDeposit);
		}else {
			account = new BankAccount(accountNumber, name);
		}
		
		System.out.println(account.toString());
		
		System.out.println("Deposit value:");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		System.out.printf("Your balance is %.2f \n", account.getBalance());
		
		System.out.println("Withdraw value:");
		double withdraw = sc.nextDouble();
		account.drawOut(withdraw);
		System.out.printf("Your balance is %.2f \n", account.getBalance());
		

	}

}
