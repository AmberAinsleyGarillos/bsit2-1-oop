public class BankingDemo {

    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: 3.0%");

        System.out.println("");

        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", 2500.0);
        BankAccount account3 = new BankAccount("Bob Johnson", 500.0);

        System.out.println("");

        System.out.println("≡≡≡ Account Operations ≡≡≡");
        account1.deposit(500.0);
        account2.withdraw(300.0);

        System.out.println("");

        System.out.println("≡≡≡ Interest Calculation ≡≡≡");
        account1.calculateInterest();
        account2.calculateInterest();
        account3.calculateInterest();

        System.out.println("");

        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}