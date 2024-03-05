public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();
        // Deposit Test
        account1.deposit("checking", 100);
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        account2.deposit("savings", 200);
        account3.deposit("checking", 300);
        // - each deposit should increase the amount of totalMoney
        double totalMoney = account1.getCheckingBalance() + account2.getSavingsBalance() + account3.getCheckingBalance();
        // Withdrawal Test
        account1.withdraw("checking", 50);
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        account2.withdraw("savings", 100);
        account3.withdraw("checking", 150);
        // - each withdrawal should decrease the amount of totalMoney
        totalMoney = account1.getCheckingBalance() - account2.getSavingsBalance() + account3.getCheckingBalance();
        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Number of accounts: " + account1.getAccount() + " total Money : " + totalMoney);
    }
}
