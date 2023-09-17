package practice;

public class percentageLoop {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest =" + calculateinterest(10000.0, 2.0));
       // for (int number = 0; number<9; number+=1) {
        //    System.out.println("10,000 at 2% interest =" + number + "calculateinterest");
        //}
       // for(int number = 0; number<9; number++) {
         //   System.out.println("10,000 at " + number + "% interest =" +  calculateinterest(10000.0, number));
        //}
        for(int number =1; number<9; number++) {
            System.out.println("10,000 at " + number + "% interest =" +  String.format("%.2f",calculateinterest(10000.0, number)));
        }
    }
        public static double calculateinterest ( double amount, double interestrate){
            return (amount * (interestrate / 100));

    }
}
