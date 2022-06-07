package exercicio_OO_TryCatch;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {	
	}
	
	public Account(Integer number, String holdewr, Double withdrawLimit, Double balance) {
		this.number = number;
		this.holder = holdewr;
		this.withdrawLimit = withdrawLimit;
		this.balance = balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(amount > getBalance()) {
			throw new BusinessException("Withdraw error: amount exceeds limit.");
		}
		else if(amount > getWithdrawLimit()){
			throw new BusinessException("Withdraw error: insufficient funds.");
		}
		else
		{
			balance -= amount;
		}
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	

}
