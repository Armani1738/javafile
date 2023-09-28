package ChibuzorClassTask;

public class AverageOfSum3 {
    public static void main(String[] args) {
        int count;
        int sum = 0;
        double average = 0;
        for (count = 1; count <= 10; count++) {
            if (count % 2 ==0) sum +=count;
        }
        average = (double) sum / count;
        System.out.println(average);

    }
}
