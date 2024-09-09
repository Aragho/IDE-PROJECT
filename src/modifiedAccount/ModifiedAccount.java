package modifiedAccount;
public class ModifiedAccount {
    private String firstName;
    private String lastName;
    private int pin;
    private static int countAccountsCreated;
    private int getBalance;
    private int balance;


    public ModifiedAccount(String firstName, String lastName, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        countAccountsCreated++;

    }

    public String getName(){
        return firstName + " " + lastName;
    }
    public static int countAccountsCreated(){
        return countAccountsCreated;
    }
    public int getBalance(){
        return getBalance;
    }
    public void deposit(int amount) {
        if(amount > 0){
            getBalance += amount;
        }
    }
    public void withdraw(int amount) {
        if(amount >= balance){
            balance -= amount;
        }
    }

}


