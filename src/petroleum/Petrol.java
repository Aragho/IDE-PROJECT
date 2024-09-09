package petroleum;

import java.util.Scanner;




public class Petrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ADEFOLARIN Petrol Station: ");
        System.out.println("Petrol: 650 per litre:" +  "deisel 1000 per litre ");
        System.out.print("Enter the quantity purchased in litres:");
        int amount = scanner.nextInt();
        System.out.print("Enter the price per litre:");
        double pricePerLitre = scanner.nextDouble();
        System.out.print("Enter the percentage discount:");
        double percentageDiscount = scanner.nextDouble();
        PetrolPurchase petrolPurchase = new PetrolPurchase("ikorodu", "Deisel",amount,pricePerLitre, percentageDiscount);
        System.out.println(petrolPurchase.getData());
        petrolPurchase.setNetAmount(amount,pricePerLitre,percentageDiscount);
        System.out.printf("Net purchase amount: $%.2f%n", petrolPurchase.getPurchaseAmount());
    }



}
