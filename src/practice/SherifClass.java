package practice;

public class SherifClass {
    public static void main(String[] args) {
        int[] array = {5,4,1,0,6,7,9,2,3};
        getOddSumOfArray(array);
        int[] array1 = {5,4,1,0,6,7,9,2,3};
        getEvenSumOfArray(array1);
        int[] array2 = {5,4,1,0,6,7,9,2,3};
        getOddSumOfArray1(array2);

    }
    public static int getOddSumOfArray(int[] Array){
        int count;
        int sum = 0;
        for (count = 1; count < Array.length; count+=2) {
            sum +=Array[count];

        }
        return sum;
    }
    public static int getEvenSumOfArray(int[] Array){
        int count;
        int sum = 0;
        for (count =0; count  < Array.length ; count +=2) {
            sum +=Array[count];

        }
        return sum;
    }
    public static int getOddSumOfArray1(int[] number){
        int count;
        int sum = 0;
        for (count = 0; count <number.length ; count++) {
            if (number[count] % 2 == 1){
                sum +=number[count];
            }
            return sum;

        }
        return sum;
    }
}
