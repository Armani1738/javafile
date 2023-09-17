package Chapter3;

import java.util.Scanner;

public class Cardriver1 {
    public static void main(String[] args) {
         Car1 mycar = new Car1("Venza", "2022",800000000,5);
        int result = mycar.getDiscount();
        System.out.println("discounted price is "+result);
        Car1 car2 = new Car1("Venza", "2022",100000000,7);
        int discount = car2.getDiscount();
        System.out.println("discounted price for car 2 is "+discount);
    }
}
