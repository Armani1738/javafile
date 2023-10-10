//package practice;
//
//public class CcCard {
//    public static void main(String[] args) {
//        long number = 5196081888500645L;
//        System.out.println(number + " is " +
//                (isValid(number) ? "valid" : "invalid"));
//    }
//    public static boolean isValid(String [] number) {
//        return (getSize(number) >= 13 && getSize(number) <= 16) && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) && ((sumOfDoubleEvenPlace(number) +
//                        sumOfOddPlace(number)) % 10 == 0);
//    }
//    public static int sumOfDoubleEvenPlace(long number) {
//        int sum = 0;
//        String num = number + "";
//        for (int count = getSize(number) - 2; count >= 0; count -= 2)
//            sum += getDigit(Integer.parseInt(num.charAt(count) + "") * 2);
//        return sum;
//    }
//    public static int getDigit(int number) {
//        if (number < 9)
//            return number;
//        return number / 10 + number % 10;
//    }
//    public static int sumOfOddPlace(long number) {
//        int sum = 0;
//        String num = number + "";
//        for (int count = getSize(number) - 1; count >= 0; count -= 2)
//            sum += Integer.parseInt(num.charAt(count) + "");
//        return sum;
//    }
//    public static boolean prefixMatched(long number, int digit) {
//        return getPrefix(number, getSize(digit)) == digit;
//    }
//    public static int getSize(String [] digit) {
//        String num = digit + "";
//        return num.length();
//    }
//    public static long getPrefix(long number, int digit) {
//        if (getSize(number) > digit) {
//            String num = number + "";
//            return Long.parseLong(num.substring(0, digit));
//        }
//        return number;
//    }
//}