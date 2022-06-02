package exerciciosPropostos7;

public class BankAccount {
	
	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}
	
	public BankAccount(int accountNumber, String name, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.name = name;
		deposit(initialDeposit);
	}

	public void deposit(double value) {
		balance += value;
	}
	
	public void drawOut(double value) {
		balance -= value + 5.00;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "BankAccount: "
				+ "accountNumber=" + accountNumber + ""
						+ " name=" + name + " "
								+ "balance=" + balance + "";
	}
	
	
	
	

}
