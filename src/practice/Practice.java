//package practice;
//
//import java.util.Scanner;
//
//public class Practice {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double average = 0;
//        int total = 0;
//        int number = 0;
//        for (int count = 1; count <= 10; count+=2) {
//            System.out.println("Enter a number: ");
//            number = scanner.nextInt();
//
//            if (number  >= 100){
//                System.out.println("number is not applicable");
//            }
//            total += number;
//        }
//        average = total / number;
//        System.out.println("The average of the number is:"+ average);
//        System.out.println("The total of the number is: "+ total);
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//package ChibuzorAssignment;
//
//        import java.util.Scanner;
//
//public class PersonalityTestAnswers {
//    public static int introvert;
//    public static int extrovert;
//    public static int sensing;
//    public static int intuitive;
//    public static int thinking;
//    public static int feeling;
//    public static int judging;
//    public static int perceptive;
//    public static String collectAnswers(Scanner check){
//        String option;
//        while(true){
//            option = check.nextLine();
//            if(option.trim().equalsIgnoreCase("a".trim()) || option.trim().equalsIgnoreCase("b")){
//                return option;
//            }
//            else {
//                System.out.println("Invalid input,kindly Select A or B");
//            }
//        }
//    }
//    public static int sumOption(int[] questionAnswers){
//        int total = questionAnswers[0];
//        for (int count = 0; count < questionAnswers.length; count++) {
//            total += count;
//        }
//        return total;
//    }
//    public static String getPersonalityTest(){
//        if (introvert > extrovert){
//            System.out.println("I");
//        }
//        else {
//            System.out.println("E");
//        }
//        if (sensing > intuitive){
//            System.out.println("S");
//        }
//        else {
//            System.out.println("N");
//        }
//        if (thinking > feeling){
//            System.out.println("T");
//        }
//        else {
//            System.out.println("F");
//        }
//        if (judging > perceptive){
//            System.out.println("J");
//        }
//        else {
//            System.out.println("P");
//        }
//        return "";
//    }
//}
//
////    public static void getIntrovert(String reply) {
////        if (reply.equalsIgnoreCase("A")) {
////            extrovert++;
////        } else if (reply.equalsIgnoreCase("B")) {
////            introvert++;
////        } else {
////            throw new IllegalArgumentException("Wrong option:\nSelect A or B");
////        }
////    }
////    public static void getSensing(String reply) {
////        if (reply.equalsIgnoreCase("A")) {
////            sensing++;
////        } else if (reply.equalsIgnoreCase("B")) {
////            intuitive++;
////        } else {
////            throw new IllegalArgumentException("Wrong option:\nSelect A or B");
////        }
////    }
////    public static void getThinking(String reply) {
////        if (reply.equalsIgnoreCase("A")) {
////            thinking++;
////        } else if (reply.equalsIgnoreCase("B")) {
////            feeling++;
////        } else {
////            throw new IllegalArgumentException("Wrong option:\nSelect A or B");
////        }
////    }
////    public static void getJudging(String reply) {
////
////        if (reply.equalsIgnoreCase("A")) {
////            judging++;
////        } else if (reply.equalsIgnoreCase("B")) {
////            perceptive++;
////        } else {
////            throw new IllegalArgumentException("Wrong option:\nSelect A or B");
////        }
////    }
//
