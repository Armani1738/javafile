package ChibuzorArrayAssignment;
public class EvenNumbers {
    public static int Even(int[] array) {
        array = new int [7];
        int count;
        int even = array[0];
        for (count = 0; count <=array.length; count++){
            if(array[count] % 2 == 0){
              even = even + array[count];
        }
    }
        return even;
    }
}