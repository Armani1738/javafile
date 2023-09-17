package ChibuzorAssignment;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The Twelve Days Of Christmas: ");
        int userInput = scanner.nextInt();
        switch (userInput) {
            case 1 -> System.out.println("On the first day of Christmas my true love sent to me:");
            case 2 -> System.out.println("on the second day of christmas my true love sent to me:");
            case 3 -> System.out.println("on the third day of christmas my true love sent to me:");
            case 4 -> System.out.println("on the fourth day of christmas my true love sent to me:");
            case 5 -> System.out.println("on the fifth day of christmas my true love sent to me:");
            case 6 -> System.out.println("on the sixth day of christmas my true love sent to me:");
            case 7 -> System.out.println("on the seventh day of christmas my true love sent to me:");
            case 8 -> System.out.println("on the eighth day of christmas my true love sent to me:");
            case 9 -> System.out.println("on the ninth day of christmas my true love sent to me:");
            case 10 -> System.out.println("on the tenth day of christmas my true love sent to me:");
            case 11 -> System.out.println("on the eleventh day of christmas my true love sent to me:");
            case 12 -> System.out.println("on the twelve day of christmas my true love sent to me:");
            default -> System.out.println("wrong input");
        }

        switch (userInput) {
            case 12: {
                System.out.println("12 Drummers Drumming");
            }
            case 11: {
                System.out.println("11 Pipers Piping");
            }
            case 10: {
                System.out.println("10 Lords a Leaping");
            }
            case 9: {
                System.out.println("9 Ladies Dancing");
            }
            case 8: {
                System.out.println("8 Maids a Milking");
            }
            case 7: {
                System.out.println("7 Swans a Swimming");
            }
            case 6: {
                System.out.println("6 Geese a Laying");
            }
            case 5: {
                System.out.println("5 Golden Rings");
            }
            case 4: {
                System.out.println("4 Calling Birds");
            }
            case 3: {
                System.out.println("3 French Hens");
            }
            case 2: {
                System.out.println("2 Turtle Doves");
            }
            case 1: {
                System.out.println("A Partridge in a Pear Tree");
            }
        }
    }
    }

