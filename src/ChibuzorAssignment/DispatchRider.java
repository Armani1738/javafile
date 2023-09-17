package ChibuzorAssignment;

public class DispatchRider {

    public static int parcel(int collection) {
        int basePay =0;
         if (collection < 50) {
         basePay = collection * 160 + 5000;
        } else if (collection <=59) {
            basePay = collection * 200 + 5000;
        } else if (collection <= 69) {
            basePay = collection * 250 + 5000;
        } else if (collection >=70) {
            basePay = collection * 500 + 5000;
        }
        return basePay;
    }

}