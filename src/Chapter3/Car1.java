package Chapter3;

public class Car1 {
    private String model;
    private String year;
    private double price;
    private int discount;

    public Car1(String model, String year, double price, int discount) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.discount = discount;
    }
    public void getModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
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
        this.price = price;
    }

    public int getDiscount() {
        int discountPrice = (int) ((discount * price) / 100);
        price = price - discountPrice;
        return (int) price;
    }

}