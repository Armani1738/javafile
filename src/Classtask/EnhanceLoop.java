package Classtask;

public class EnhanceLoop {
    public static void main(String[] args) {
        int[][] items = {{34, 23, 65}, {22, 67, 44, 68}};
        for (int[] iterate : items) {
            for (int item : iterate) {
                if (item == 22) {
                    System.out.println();
                }
                System.out.printf(item+"  \t");
            }
        }
    }
}