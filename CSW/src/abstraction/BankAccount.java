package abstraction;

abstract class BankAccount {

		// TODO Auto-generated method stub
		private String accountNumber;
		private double balance;
		public BankAccount(String accountNumber,double balance) {
			this.accountNumber = accountNumber;
			this.balance = balance;
		}
		public String getAccountNumber() {
			return accountNumber;
		}
		public double getbalance() {
			return balance;
		}
		protected void setBalance(double balance) {
			this.balance = balance;
		}
		public abstract void deposit (double amount);
		public abstract void withdraw (double amount);
	

}
