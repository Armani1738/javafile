package Chapter3;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double literPrice;
    private double percentageDiscount;
    public PetrolPurchase(String location, String petrolType, int quantity, double literPrice, double percentageDiscount){
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.literPrice = literPrice;
        this.percentageDiscount = percentageDiscount;
    }
    public void getLocation(String location){
        this.location = location;
    }
    public String setLocation(){
        return location;
    }
    public void getPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public String setPetrolType(){
        return petrolType;
    }
    public void getQuantity(int quantity){
        this.quantity = quantity;
    }
    public int setQuantity(){
        return quantity;
    }
    public void getLiterPrice(double literPrice){
        this.literPrice = literPrice;
    }
    public double setLiterPrice() {
        return literPrice;
    }
    public void getPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double setPercentageDiscount() {
        return percentageDiscount;
    }
    public double getPurchaseAmount(){
        double netPurchaseAmount = (quantity * literPrice) - percentageDiscount;
        return netPurchaseAmount;
    }
}
