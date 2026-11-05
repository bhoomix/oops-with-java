class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String name, int number, double balance) {

        accountHolder = name;
        accountNumber = number;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Getter Methods
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount");
        }
        else if (amount > balance) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class Practical10 {
    public static void main(String[] args) {

        BankAccount b = new BankAccount("Bhoomi", 12345, 1000);

        System.out.println("Account Details:");
        b.display();

        b.deposit(500);

        b.withdraw(300);

        b.deposit(-100);

        b.withdraw(2000);

        System.out.println("\nUpdated Account Details:");
        b.display();
    }
}
