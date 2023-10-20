//package ChibuzorAssignment;
//
//import java.util.Scanner;
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
//    public static String collectAnswers(String check){
//        String option;
//        while(true){
//                 option = check.nextLine();
//                if(option.trim().equalsIgnoreCase("a".trim()) || option.trim().equalsIgnoreCase("b")){
//                    return option;
//                }
//                else {
//                    System.out.println("Invalid input,kindly Select A or B");
//                }
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