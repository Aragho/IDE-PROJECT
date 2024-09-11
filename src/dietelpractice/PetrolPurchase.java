package dietelpractice;

public class PetrolPurchase {
    private String location;
    private String typeOfPetrol;;
    private int quantityOfPurchase;
    private double pricePerLitre;
    private double discount;
    private String getData;
    public PetrolPurchase(String location, String typeOfPetrol, int quantityOfPurchase, double pricePerLitre, double discount) {
        this.location = location;
        this.quantityOfPurchase = quantityOfPurchase;
        this.typeOfPetrol = typeOfPetrol;
        this.pricePerLitre = pricePerLitre;
        this.discount = discount;
    }

    public String getLocation () {
        return location;
    }

    public void setLocation () {
        this.location = location;
    }
    public int getQuantityOfPurchase(){
        return quantityOfPurchase;
    }
    public void setQuantityOfPurchase(){
        this.quantityOfPurchase = quantityOfPurchase;
    }
    public String getTypeOfPetrol(){
        return typeOfPetrol;
    }
    public void setTypeOfPetrol(){
        this.typeOfPetrol = typeOfPetrol;
    }
    public double    getPricePerLitre(){
        return pricePerLitre;
    }
    public void setPricePerLitre(){
        this.pricePerLitre = pricePerLitre;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount() {
        this.discount = discount;
    }

    public double getPurchaseAmount() {
        double totalCost = quantityOfPurchase * pricePerLitre;
        double discountAmount = totalCost - (discount / 100);
        return totalCost - discountAmount;
    }
    public String getData(){
        return("Location: " + location+ "\nPetrol Type:" + typeOfPetrol + "\nQuantity: " + quantityOfPurchase + "\nPrice:"    + pricePerLitre + "\nDiscount: " + discount + "\n" );

    }


    public void setNetAmount(int amount, double pricePerLitre, double percentageDiscount) {
    }
}
