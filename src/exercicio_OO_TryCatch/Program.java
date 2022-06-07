package exercicio_OO_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter data Account:");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			Account account = new Account(number, holder, initialBalance, withdrawLimit);

			System.out.print("Enter amount for withdraw:");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println("New balance: " + account.getBalance());

		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid data.");
		}

		sc.close();
	}

}
