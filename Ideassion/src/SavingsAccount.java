package Banking;

	public class SavingsAccount extends BankAccount {
		public SavingsAccount(String accNumber, String accName) {
			super(accNumber, accName);
			
		}

		public boolean deposit(double amount) {
			if (super.deposit(amount)) {
				
				return true;
			}
			return false;
		}
		
		public boolean withdraw(double amount) {
			if (super.withdraw(amount)) {
				
				return true;
			}
			return false;
		}


		//Hello jagan
		//This is my frist branchin created ..........
		//This is master buddy
	}


