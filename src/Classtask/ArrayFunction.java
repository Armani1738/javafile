package Classtask;

public class ArrayFunction {
    public static void main(String[] args) {
        String[] input = {"ABC21F", "13CPZ", "A1L"};
        int totalcount = stringNumber(input);
        System.out.println(totalcount);
    }


    public static int stringNumber(String[] input) {
        int count = 0;
        for (String str : input) {
            for (int index = 0; index < str.length(); index++) {
                char number = str.charAt(index);
                if (number >= '0' && number <= '9') {
                    count++;
                }
            }
        }
        return count;
    }

}