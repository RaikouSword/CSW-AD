//Q8
package ass1;
public class BankingApp {

    abstract static class Account {
        private String accountNumber;
        private double balance;
        public Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public double getBalance() {
            return balance;
        }
        public abstract void deposit(double amount);
        public abstract void withdraw(double amount);
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
    static class SavingsAccount extends Account {
        private double interestRate;
        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }
        @Override
        public void deposit(double amount) {
            double interest = amount * interestRate / 100;
            double totalAmount = amount + interest;
            System.out.println("Depositing " + totalAmount + " (including interest of " + interest + ")");
            super.balance += totalAmount;
        }
        @Override
        public void withdraw(double amount) {
            if (getBalance() >= amount) {
                super.balance -= amount;
                System.out.println("Withdrawing " + amount);
            } else {
                System.out.println("Insufficient balance for withdrawal.");
            }
        }
    }
    static class CurrentAccount extends Account {
        private double overdraftLimit;
        public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
            super(accountNumber, balance);
            this.overdraftLimit = overdraftLimit;
        }
        @Override
        public void withdraw(double amount) {
            if (getBalance() + overdraftLimit >= amount) {
                super.balance -= amount;
                System.out.println("Withdrawing " + amount);
            } else {
                System.out.println("Exceeded overdraft limit. Insufficient funds.");
            }
        }
        @Override
        public void deposit(double amount) {
            System.out.println("Depositing " + amount);
            super.balance += amount;
        }
    }
    public static void main(String[] args) {
        Account mySavingsAccount = new SavingsAccount("SA12345", 1000.0, 5.0); 
        Account myCurrentAccount = new CurrentAccount("CA54321", 500.0, 200.0);
        System.out.println("Performing transactions for Savings Account:");
        mySavingsAccount.deposit(200.0); 
        mySavingsAccount.withdraw(1200.0); 
        mySavingsAccount.displayAccountDetails();

        System.out.println("\nPerforming transactions for Current Account:");
        myCurrentAccount.deposit(100.0); 
        myCurrentAccount.withdraw(600.0);
        myCurrentAccount.displayAccountDetails();
    }
}

