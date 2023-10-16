//package practice;
//
//import JonathanTask.DataExtraction;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class DataExtractionTest {
//    @Test
//    void canExtractDataFromDataSet(){
//        DataExtraction dataExtraction = new DataExtraction();
//        int[][] dataset = {
//                {4, 2, 4, 1},
//                {6, 8, 3, 6},
//                {2, 6, 8, 2},
//                {5, 8, 2, 6}
//        };
//        int row = 2;
//        int startPosition = 2;
//        int endPosition = 4;
//
//        int[] result = dataExtraction.extract(dataset, row, startPosition, endPosition);
//        assertEquals(8, result[0]);
//        assertEquals(3, result[1]);
//        assertEquals(6, result[1]);
//        assertEquals(3, result.length);
//
//    }
//
//    @Test
//    void canExtractDataFromDataSetColumn() {
//        DataExtraction dataExtraction = new DataExtraction();
//        int[][] dataset = {
//                {4, 2, 4, 1},
//                {6, 8, 3, 6},
//                {2, 6, 8, 2},
//                {5, 8, 2, 6}
//        };
//        int column = 2;
//        int startPosition = 2;
//        int endPosition = 4;
//
//        int[] result = dataExtraction.jona(dataset, column, startPosition, endPosition);
//
//
//        assertEquals(8, result[0]);
//        assertEquals(3, result[1]);
//        assertEquals(6, result[1]);
//        assertEquals(3, result.length);
//    }
//    }
