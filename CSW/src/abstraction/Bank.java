package abstraction;
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ibal,damt,wamt;
		ibal = 1000.00;
		SavingsAccount savingsAccount = new SavingsAccount("SA001", ibal);
		System.out.println("Savings A/c: "+"\n"+"Inital balance is: $"+ibal);
		damt = 500.00;
		savingsAccount.deposit(damt);
		wamt = 250.00;
		savingsAccount.withdraw(wamt);
		wamt = 1600.00;
		System.out.println("\nTry to withdraw: $"+wamt);
		savingsAccount.withdraw(wamt);
		
		System.out.println();
		
		ibal = 500.00;
		CurrentAccount currentAccount = new CurrentAccount("CA001",ibal);
		System.out.println("Current A/c: \nInital balance is: $"+ibal);
		damt = 2500.00;
		currentAccount.deposit(damt);
		wamt = 1250.00;
		currentAccount.withdraw(wamt);
		wamt = 6000.00;
		System.out.println("\nTry to withdraw: $"+wamt);
		currentAccount.withdraw(wamt);
		
	}

}
