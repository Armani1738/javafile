package practice;

public class jona {
    int[] extract;


    public int[] extract(int[][] dataset, int row, int startPosition, int endPosition) {
        int[] rowData = dataset[row - 1];
        int[] extractedData = new int[(endPosition - startPosition) +1];
        int count = 0;
        for (int i = startPosition - 1; i < endPosition; i++) {
            extractedData[count] = rowData[i];
            count++;
        }
        return extractedData;
    }
    public int[] extractColumn(int[][] dataset, int row, int startPosition, int endPosition) {
        int[] rowData = dataset[row - 1];
        int[] extractedData = new int[(endPosition - startPosition) + 1];
        int count = 0;
        for (int i = startPosition - 1; i < endPosition; i++) {
            extractedData[count] = rowData[i];
            count++;
        }
        return extractedData;
    }
}
