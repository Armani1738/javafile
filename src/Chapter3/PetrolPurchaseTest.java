package Chapter3;

import Chapter3.PetrolPurchase;

public class PetrolPurchaseTest{
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Sabo", "diesel", 10,105.5,20.5);
       petrol.getPurchaseAmount();
        System.out.printf("The location of the petrol station is:%s\nThe purchase amount of the petrol is:%.2f",petrol.setLocation(), petrol.getPurchaseAmount());
    }







}
