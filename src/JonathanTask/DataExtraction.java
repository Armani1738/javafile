package JonathanTask;

import java.util.Arrays;
import java.util.Scanner;

public class DataExtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number for row");
        int row = input.nextInt();
        System.out.println("Enter number for column");
        int column = input.nextInt();
        int[][] data = new int[row][column];
        for (int count = 0; count < data.length; count++) {
            for (int counts = 0; counts < data[count].length; counts++) {
                System.out.println("Enter index into data: ");
                int record = input.nextInt();
                data[count][counts] = record;

            }
        }
        System.out.println(Arrays.deepToString(data));
        System.out.println("Enter the start position: ");
        int start = input.nextInt();
        System.out.println("Enter the end position: ");
        int end = input.nextInt();
        System.out.println("Enter the row desired: ");
        int rows = input.nextInt();
        System.out.println(Arrays.toString(extractByRow(data, rows, start,end)));
    }
    public static int[] extractByRow(int[][] data, int row, int start, int end){
        int[] rowData = data[row - 1];
        int[] extractionData = new int[(end - start) + 1];
        int count = 0;
        for (int counts = start; counts < end; counts++) {
            extractionData[count] = rowData[counts];
            count ++;

        }
        return extractionData;
    }
    public int[] extractByColumn(int[][] dataset, int column, int start, int end){
        int[] extractData = new int[(end - start) + 1];
        int count = 0;
        for (int index = start; index < end; index++) {
            extractData[count] = dataset[index][column];
            count++;
        }
        return extractData;
        }
    }

