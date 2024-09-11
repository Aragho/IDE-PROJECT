package carmodel;

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


}
