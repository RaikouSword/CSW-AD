package abstraction;

public class CurrentAccount extends BankAccount {
		// TODO Auto-generated method stub
		public CurrentAccount(String accountNumber, double balance) {
			super(accountNumber,balance);
		}
		@Override
		public void deposit(double amount) {
			setBalance(getbalance()+amount);
			System.out.println("Deposit of $:"+amount+" successful. \nCurrent balance is: $"+getbalance());
		}
		@Override
		public void withdraw(double amount) {
			if(getbalance() >= amount) {
				setBalance(getbalance() - amount);
				System.out.println("Withdrawl of $"+amount+" successful. \nCurrent balance is: $"+getbalance());
			}
			else {
				System.out.println("Insufficient funds. Withdrawl failed.");
			}
		}

}
