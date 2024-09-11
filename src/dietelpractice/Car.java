package dietelpractice;

public class Car {
    private String model;
    private String year;
    public double price;
    private double applyDiscount;
    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }else{
            this.price = 0;
        }

    }
    public void applyDiscount(double percentage){
        if(percentage > 0){
            this.price -= this.price * (percentage / 100);
        }

    }


    public static class ModifiedAccount {
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
}
