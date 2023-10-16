package ChibuzorAssignment;

import java.util.Scanner;

import static practice.Guessgame.GuessGame.guessingNumberGame;

public class Nokia3310 {
    Scanner scanner = new Scanner(System.in);

    public void Functions() {
        System.out.println("""
                =========Nokia Phone=========
                    ======  Hello ======
                -------------------------
                  --------------------
                   --- Main menu ---
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
        System.out.println("Kindly select options:");
        int functions = scanner.nextInt();
        switch (functions) {
            case 1 -> PhoneBook();
            case 2 -> Message();
            case 3 -> Chat();
            case 4 -> CallRegister();
            case 5 -> Tones();
            case 6 -> Settings();
            case 7 -> CallDivert();
            case 8 -> Games();
            case 9 -> Calculator();
            case 10 -> Reminders();
            case 11 -> Clock();
            case 12 -> Profiles();
            case 13 -> SimServices();
            default -> Functions();
        }
    }

    private void PhoneBook() {
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
                11-> Back to main menu
                                            """);
        System.out.print("kindly select options: ");
        int phonebook = scanner.nextInt();
        switch (phonebook) {
            case 1 -> System.out.println("search");
            case 2 -> System.out.println("Service Nos");
            case 3 -> System.out.println("Add Name");
            case 4 -> System.out.println("Erase");
            case 5 -> System.out.println("Edit");
            case 6 -> System.out.println("Assign tone");
            case 7 -> System.out.println("Send B'card");
            case 8 -> {
                System.out.println("""
                        1-> Type of view
                        2-> Memory status
                        3-> Back to phoneBook menu
                        4-> Back to main menu
                                                    """);
                System.out.print("kindly select options: ");
                int options = scanner.nextInt();
                switch (options) {
                    case 1 -> System.out.println("Type of view");
                    case 2 -> System.out.println("Memory status");
                    case 3 -> PhoneBook();
                    case 4 -> Functions();
                }
            }
            case 9 -> System.out.println("Speed dials");
            case 10 -> System.out.println("Voice tags");
            default -> Functions();

        }
    }

    public void Message() {
        System.out.println("===== Message Box =====");
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
                11-> Back to phonebook
                12-> Back to main menu
                                   """);
        System.out.print("kindly select options: ");
        int message = scanner.nextInt();
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
                int option = scanner.nextInt();
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
                        int common = scanner.nextInt();
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
            case 11 -> PhoneBook();
            default -> Functions();
        }
    }

    public void Chat() {
        System.out.println("Chat");
        System.out.println("""
                1-> Text
                2-> Chat settings
                3-> Back to phonebook
                4-> Back to main menu
                """);
        System.out.println("Kindly select options:");
        int chat = scanner.nextInt();
        switch (chat) {
            case 1 -> System.out.println("Text");
            case 2 -> System.out.println("Chat settings");
            case 3 -> Chat();
            default -> Functions();
        }
    }

    public void CallRegister() {
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
                9-> Back to call register
                10-> Back to phonebook
                11-> Back to main menu
                               """);
        System.out.println("Kindly select options:");
        int callRegister = scanner.nextInt();
        switch (callRegister) {
            case 1 -> System.out.println("Missed call");
            case 2 -> System.out.println("Received calls");
            case 3 -> System.out.println("dialled numbers");
            case 4 -> System.out.println("Erase recent call list");
            case 5 -> {
                System.out.println("Show call duration");
                System.out.println("""
                        1-> Last call duration
                        2-> All calls' duration
                        3-> Received calls' duration
                        4-> Dialled calls' duration
                        5-> Clear timer
                        6-> Back to main menu
                        """);
                System.out.println("Kindly select options: ");
                int callDuration = scanner.nextInt();
                switch (callDuration) {
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All calls' duration");
                    case 3 -> System.out.println("Received calls' duration");
                    case 4 -> System.out.println("Dialled calls' duration");
                    case 5 -> System.out.println("Clear timer");
                    default -> Functions();
                }
            }
            case 6 -> {
                System.out.println("Show call cost");
                System.out.println("""
                        1-> Last call cost
                        2-> All calls' cost
                        3-> Clear counters
                        """);
                System.out.println("Kindly select options:");
            }
            case 7 -> {
                System.out.println("Call cost settings");
                System.out.println("""
                        1-> Call cost limit
                        2-> Show cost in
                        """);
            }
            case 8 -> System.out.println("Prepaid credit");
            default -> Functions();
        }
    }

    public void Tones() {
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
                10-> Back to phonebook
                11-> Back to main menu
                                             """);
        System.out.println("kindly press options: ");
        int ringTone = scanner.nextInt();
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
            case 10 -> Tones();
            default -> Functions();
        }
    }

    public void Settings() {
        System.out.println("Settings");
        System.out.println("""
                1-> Call settings
                2-> Phone settings
                3-> Display settings
                4-> Network settings
                5-> Security settings
                6-> Restore factory settings
                7-> Back to phonebook
                8-> Back to main menu            
                        """);
        System.out.println("Kindly select options: ");
        int callSettings = scanner.nextInt();
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
                        7-> Back to main menu
                           """);
                System.out.println("Kindly select option: ");
            }
            case 2 -> System.out.println("Phone settings");
            case 3 -> System.out.println("Display settings");
            case 4 -> System.out.println("Network settings");
            case 5 -> System.out.println("Security settings");
            case 6 -> System.out.println("Restore factory settings");
            case 7 -> Settings();
            default -> Functions();
        }
    }

    public void CallDivert() {
        System.out.println("Call divert");
        Functions();

    }
    public void Games() {
        System.out.println("Games");

        System.out.println("""
                1-> F1 race
                2-> Guessing right
                3-> Snake
                4-> Game settings
                """);
        System.out.println("Kindly select options: ");
        int F1race = scanner.nextInt();
        switch (F1race) {
            case 1 -> {
                System.out.println("F1 race");
            }
            case 3 -> System.out.println("Snake");
            case 2 -> guessingNumberGame();
            case 4 -> System.out.println("Game settings");
            case 5 -> Games();
            default -> Functions();
        }
    }
    public void Calculator(){
        System.out.println("Calculator");
        System.out.println("""
                        1-> Making a calculation
                        2-> Back to main menu
                        """);
        System.out.println("Kindly select option: ");
        int MakingCalculation = scanner.nextInt();
        switch (MakingCalculation){
            case 1 -> System.out.println("Calculations");
            case 4 -> Calculator();
            default -> Functions();
        }
    }
    public void Reminders(){
        System.out.println("Reminders");
        System.out.println("""
                        1-> Add new
                        2-> Erase
                        3-> view all
                        4-> Back to phonebook
                        5-> Back to main menu
                        """);
        System.out.println("Kindly select options: ");
        int Addnew = scanner.nextInt();
        switch (Addnew){
            case 1 -> System.out.println("Add new");
            case 2 -> System.out.println("Erase");
            case 3 -> System.out.println("View all");
            case 4 -> Reminders();
            default -> Functions();
        }
    }
    public void Clock(){
        System.out.println("Clock");
        System.out.println("""
                        1-> Alarm clock
                        2-> Clock settings
                        3-> Date settings
                        4-> Stopwatch
                        5-> Countdown timer
                        6-> Auto update of date
                        7-> Back to phonebook
                        8-> Back to main menu
                                              """);
        System.out.println("Kindly select options: ");
        int alarmClock = scanner.nextInt();
        switch (alarmClock){
            case 1 -> System.out.println("Alarm clock");
            case 2 -> System.out.println("Clock settings");
            case 3 -> System.out.println("Date settings");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown timer");
            case 6 -> System.out.println("Auto update of date");
            case 7 -> Clock();
            default -> Functions();
        }
    }
    public void Profiles(){
        System.out.println("Profile");
        System.out.println("""
                        1-> Activating profile and change settings
                        2-> General 
                        3-> Meeting
                        4-> Outdoor
                        5-> Indoor
                        6-> Silent
                        7-> personalise
                        8-> Back to phonebook
                        9-> Back to main menu
                        """);
        System.out.println("Kindly select options: ");
        int activatingProfile = scanner.nextInt();
        switch (activatingProfile){
            case 1 -> System.out.println("Activating profile and change settings");
            case 2 -> System.out.println("General");
            case 3 -> System.out.println("Meetings");
            case 4 -> System.out.println("outdoor");
            case 5 -> System.out.println("Indoor");
            case 6 -> System.out.println("Silent");
            case 7 -> System.out.println("Personalise");
            case 8 -> Profiles();
            default -> Functions();
        }
    }
    public void SimServices(){
        System.out.println("SIM services");
        System.out.println("""
                        1-> Airtel Services
                        2-> Sim pin
                        3-> Mobile money
                        4-> Back to phonebook
                        5-> Back to main menu
                        """);
        System.out.println("Kindly select options: ");
        int airtelServices = scanner.nextInt();
        switch (airtelServices){
            case 1 -> System.out.println("Airtel Services");
            case 2 -> System.out.println("Sim pin");
            case 3 -> System.out.println("Mobile money");
            case 8 -> SimServices();
            default -> Functions();
        }
    }
}