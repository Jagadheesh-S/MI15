package Banking;

public class BankAccount implements BankProcess {
	private String accountNumber;
	private String accountName;
	private double balance;

	// BankAccount methods
	
	public BankAccount(String accNumber, String accName) {
		accountNumber = accNumber;
		accountName = accName;
		balance = 0;
	}

	// methods to read the attributes

	
	public String getAccountName() {
		return accountName;
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public boolean deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient Fund");
			return false;
		} else {
			balance = balance - amount;
			return true;
		}
	}
}


