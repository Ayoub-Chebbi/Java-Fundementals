public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances
    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount() {
        accounts++;
    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public int getAccount(){
        return accounts;
    }
    public double getTotalMoney(){
        return totalMoney;
    }
    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    // withdraw 
    public void deposit(String account, double amount) {
        if (account.equals("checking")) {
            this.checkingBalance += amount;
            totalMoney += amount;
        } else if (account.equals("savings")) {
            this.savingsBalance += amount;
            totalMoney += amount;
        } else {
            System.out.println("Invalid account type");
        }
    }

    public void withdraw(String account, double amount) {
        if (account.equals("checking")) {
            if (this.checkingBalance - amount < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            }
        } else if (account.equals("savings")) {
            if (this.savingsBalance - amount < 0) {
                System.out.println("Insufficient funds");
            } else {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            }
        } else {
            System.out.println("Invalid account type");
        }
    }
    // getBalance
    public double getBalance(String account) {
        if (account.equals("checking")) {
            return this.checkingBalance;
        } else if (account.equals("savings")) {
            return this.savingsBalance;
        } else {
            System.out.println("Invalid account type");
            return 0;
        }
    }
    // - display total balance for checking and savings of a particular bank account
    public void displayBalance() {
        System.out.println("Checking: " + this.checkingBalance);
        System.out.println("Savings: " + this.savingsBalance);
    }
}
