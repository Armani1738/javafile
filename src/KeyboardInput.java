import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("""
                1-> English
                2-> Pidgin
                3-> Yoruba
                """);
        System.out.print("kindly select options: ");

        int userInput = Input.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("English");
                break;
            case 2:
                System.out.println("Pidgin");
                System.out.println("""
                        1 -> calabar pidgin
                        2 -> yoruba pidgin
                        3 -> normal pidgin
                                                """);
                System.out.print("kindly select options: ");

                int userInput1 = Input.nextInt();
                switch (userInput1){
                    case 1:
                        System.out.println("welcome to calabar pidgin");
                        System.out.println("amedi");
                        break;
                    case 2:
                        System.out.println("welcome to Yoruba");
                        System.out.println("Ekabo si ile wa!");
                        break;
                    case 3:
                        System.out.println("una welcome oo");
                        System.out.println("wetin you want do?");
                        break;
                    default:
                        System.out.println("wrong input");
                        break;
                }


        }
    }
}