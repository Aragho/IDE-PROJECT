package bank;

public class Account {
    private int balance;
    public int getBalance() {
        return balance;

    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance = amount + balance;
        }

    }
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }




    }
}
