package ChibuzorAssignment;

import java.security.MessageDigestSpi;
import java.util.Scanner;

public class NokiaPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Options");
        System.out.println("""
                =========Nokia Phone=========
                ========Display Options======
                
                1-> Phone book
                2-> Messages
                3-> Chat
                4-> Call Register
                5-> Tones
                6-> Settings
                7-> Call Divert
                8-> Games
                9-> Calculator
                10-> Reminders
                11-> Clock
                12-> Profiles
                13-> SIM services         
                """);
        System.out.println("kindly select options: ");
        int phoneBook = input.nextInt();
        switch (phoneBook) {
            case 1:
                System.out.println("Phone Book");
                System.out.println("""
                        1-> Search
                        2-> Service Nos
                        3-> Add Name
                        4-> Erase
                        5-> Edit
                        6-> Assign tone
                        7-> Send B' Card
                        8-> Options
                        9-> Speed Dials
                        10-> Voice Tags
                        """);
                System.out.print("kindly select options: ");
                int phonebook = input.nextInt();
                switch (phonebook) {
                    case 1 -> System.out.println("search");
                    case 2 -> System.out.println("Service Nos");
                    case 3 -> System.out.println("Add Name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send B'card");
                    case 8 -> {
                        System.out.println("Options");
                        System.out.println("""
                                1-> Type of view
                                2-> Memory status
                                """);
                        System.out.print("kindly select options: ");
                        int options = input.nextInt();
                        switch (options) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                            case 3 -> {
                                int phoneBook1 = phoneBook;
                            }
                        }
                    }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                }
            case 2:
                System.out.println("Message");
                System.out.println("""
                        1-> Write message
                        2-> Inbox message
                        3-> Outbox message
                        4-> Picture message
                        5-> Templates
                        6-> Smiley
                        7-> Message settings
                        8-> Info service
                        9-> Voice mailbox number
                        10->Service command editor
                                           """);
                System.out.print("kindly select options: ");
                int message = input.nextInt();
                switch (message) {
                    case 1 -> System.out.println("Write message");
                    case 2 -> System.out.println("Inbox message");
                    case 3 -> System.out.println("Outbox message");
                    case 4 -> System.out.println("Picture message");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smiley");
                    case 7 -> {
                        System.out.println("Message settings");
                        System.out.println("""
                                1-> Set
                                2-> Common
                                """);
                        int option = input.nextInt();
                        switch (option) {
                            case 1 -> {
                                System.out.println("Set");
                                System.out.println("""
                                        1-> Message centre number
                                        2-> Message sent as
                                        3-> Message validity
                                               """);
                            }
                            case 2 -> {
                                System.out.println("Common");
                                System.out.println("""
                                        1-> Delivery reports
                                        2-> Reply via same centre
                                        3-> Character support
                                        """);
                                System.out.println("Enter the input: ");
                                int common = input.nextInt();
                                switch (common) {
                                    case 1 -> System.out.println("Delivery report");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info services");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Services");
                }
                break;

            case 3:
                System.out.println("Chat");
                System.out.println("""
                        1->Text
                        2->Chat settings
                        """);
                System.out.println("Kindly select options:");
                break;
            case 4:
                System.out.println("Call register");
                System.out.println("""
                        1-> Missed calls
                        2-> Received calls
                        3-> Dialled numbers
                        4-> Erase recent call list
                        5-> Show call duration
                        6-> Show call cost
                        7-> Call cost settings
                        8-> Prepaid credit
                                       """);
                System.out.println("Kindly select options:");
                int Callregister = input.nextInt();
                switch (Callregister) {
                    case 1:
                        System.out.println("Missed call");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call list");
                    case 5:
                        System.out.println("Show call duration");
                        System.out.println("""
                                1-> Last call duration
                                2-> All calls' duration
                                3-> Received calls' duration
                                4-> Dialled calls' duration
                                5-> Clear timer
                                """);
                        System.out.println("Kindly select options:");
                        break;
                    case 6:
                        System.out.println("Show call cost");
                        System.out.println("""
                                1-> Last call cost
                                2-> All calls' cost
                                3-> Clear counters
                                """);
                        System.out.println("Kindly select options:");
                        break;
                    case 7:
                        System.out.println("Call cost settings");
                        System.out.println("""
                                1-> Call cost limit
                                2-> Show cost in
                                """);
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
                break;
            case 5:
                System.out.println("Tone");
                System.out.println("""
                        1-> Ringing tone
                        2-> Ringing volume
                        3-> Incoming call alert
                        4-> Composer
                        5-> Message alert tone
                        6-> Keypad tones
                        7-> Warning and game tones
                        8-> Vibrating alert
                        9-> Screen saver
                                                     """);
                System.out.println("kindly press options");
                int ringTone = input.nextInt();
                switch (ringTone) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                }
                break;
            case 6:
                System.out.println("Settings");
                System.out.println("""
                        1-> Call settings
                        2-> Phone settings
                        3-> Display settings
                        4-> Network settings
                        5-> Security settings
                        6-> Restore factory setting         
                                """);
                System.out.println("Kindly select options:");
                int callSettings = input.nextInt();
                switch (callSettings) {
                    case 1 -> {
                        System.out.println(callSettings);
                        System.out.println("""
                                1-> Automatic redial
                                2-> Speed dialling
                                3-> Call waiting options
                                4-> Own number sending
                                5-> Phone line in use
                                6-> Automatic answer
                                   """);
                        System.out.println("Kindly select option:");
                    }
                    case 2 -> System.out.println("Phone settings");
                    case 3 -> System.out.println("Display settings");
                    case 4 -> System.out.println("Network settings");
                    case 5 -> System.out.println("Security settings");
                    case 6 -> System.out.println("Restore factory settings");
                }
                break;
            case 7:
                System.out.println("Call divert");
                break;
            case 8:
                System.out.println("Games");
                System.out.println("""
                        1-> F1 race
                        2-> Snake
                        3-> Game settings
                        """);
                break;
            case 9:
                System.out.println("Calculator");
                System.out.println("""
                        1-> Making a calculation
                        """);
                break;
            case 10:
                System.out.println("Reminder");
                System.out.println("""
                        1-> Add new
                        2-> Erase
                        3-> view all
                        """);
                break;
            case 11:
                System.out.println("Clock");
                System.out.println("""
                        1-> Alarm clock
                        2-> Clock settings
                        3-> Date settings
                        4-> Stopwatch
                        5-> Countdown timer
                        6-> Auto update of date
                                              """);
            default:
                System.out.println("Nokia Phone");
                System.out.println("kindly select option");
                break;
            case 12:
                System.out.println("Profile");
                System.out.println("""
                        1-> Activating profile and change settings
                        2-> General
                        3-> Meeting
                        4-> Outdoor
                        5-> Indoor
                        6-> Silent
                        2-> personalise
                        """);
                break;
            case 13:
                System.out.println("SIM services");
                System.out.println("""
                        1-> Airtel Services
                        2-> Sim pin
                        3-> Mobile money
                        """);
        }
    }
}
