package ChibuzorAssignment;

public class Jamb {


    public static int numberOfCopies(int copies, int price) {
        int totalCopies = 0;
        if (copies >= 1 && copies <= 4){
            totalCopies = copies * price;
        }else if(copies >= 5 && copies <=9) {
            totalCopies = copies * price;
        } else if (copies >= 10 && copies <= 29) {
            totalCopies = copies * price;
        } else if (copies >= 30 && copies <= 49) {
            totalCopies = copies * price;
        } else if (copies >= 50 && copies <= 99) {
            totalCopies = copies * price;
        } else if (copies >= 100 && copies <= 199) {
            totalCopies = copies * price;
        } else if (copies >= 200 && copies <= 499 ) {
            totalCopies = copies * price;
        } else if (copies >= 500 ) {
            totalCopies = copies * price;
        }return totalCopies;
    }
    
}
