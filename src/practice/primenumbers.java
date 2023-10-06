package practice;

public class primenumbers {
    public static boolean main(String[] args) {
        int count = 0;
        int isPrime = 0;
        for (int number = 10; number < 100; number++) {
            if (isPrime(number)) ;
            count++;
            System.out.println("Number" + number + "is prime number");
            if (count == 10) {
                System.out.println("prime number count stopped");
                break;
            }
            private static boolean isPrime (int number){
                if (number == 1) {
                    return false;
                }
                return false;
                if (number % count == 0) {
                    return false;
                }
            }
        }
    }
}