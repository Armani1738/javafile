package ChibuzorAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalitiesTest {
    static int extrovert;
    static int introvert;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> amagamate = new ArrayList<>();

        System.out.println("What is the name: ");
        String username = input.nextLine();
        amagamate.add(username);

        PersonalitiesTest personalitiesTest = new PersonalitiesTest();
        personalitiesTest.question();
        personalitiesTest.username = input.nextLine();    }

    String username;
    String[] questions = new String[20];
    private static final ArrayList<String> answers = new ArrayList<>();

    public void question() {
        questions[0] = "A. expend energy, enjoy groups,     B. conserve energy, enjoy one- one";
        questions[1] = "A. Interpret literally,     B. look for meaning and possibilities";
        questions[2] = "A. logical, thinking, questioning,     B. empathetic, feeling, accommodating";
        questions[3] = "A. organized, orderly,     B. flexible, adaptable";
        questions[4] = "A. more outgoing, think out loud,     B. more reserved, think to yourself";
        questions[5] = "A. practical, realistic, experiential,     B. imaginative, innovative, theoretical";
        questions[6] = "A. candid, straight forward, frank,     B. tactful, kind, encouraging";
        questions[7] = "A. plan, schedule,     B. unplanned, spontaneous";
        questions[8] = "A. seek many tasks, public activities, interaction with others,     B. seek private, solid";
        questions[9] = "A. standard, usual, conventional,     B. different, novel, unique";
        questions[10] = "A. firm, tend to criticize, hold the line,     B. gentle, tend to appreciate, conciliate";
        questions[11] = "A. regulated, structured,     B. easy-going, live and let live";
        questions[12] = "A. external, communicative}, express yourself,     B. internal, reticent, keep to yourself";
        questions[13] = "A. focus on here-and-now,     B. look to the future, global perspective, big picture";
        questions[14] = "A. tough-minded, just,     B. tender-hearted, merciful";
        questions[15] = "A. preparation, plan ahead,     B. go with the flow, adapt as you go";
        questions[16] = "A. active, initiate,     B. reflective, deliberate";
        questions[17] = "A. facts, things, what is,     B. ideas, dreams, what could be, philosophical";
        questions[18] = "A. matter of fact, issue-oriented,     B. sensitive, people-oriented, compassionate";
        questions[19] = "A. control, govern,     B. latitude, freedom";
        iterateQuestion();
//        sumAnswer();
        extrovert();
    }

    public void iterateQuestion() {
        Scanner scanner = new Scanner(System.in);
        String answer;
        for (int i = 0; i < 19; i++) {
            System.out.println(questions[i]);
            System.out.println("Enter the options A or B: ");
            answer = scanner.nextLine().toUpperCase();
            while (!answer.equals("A") && !answer.equals("B")) {
                System.out.println("Invalid input,kindly Select A or B");
                System.out.println(questions[i]);
                answer = scanner.nextLine().toUpperCase();
            }
            answers.add(answer.toUpperCase());
        }
    }

    public void sumAnswer() {
        System.out.printf("""
                Hello %s you selected
                """, this.username);
        int countA = 0;
        int countB = 0;
        int count = 0;
        int counter = 0;
        int counts = 5;

        for (int i = 0; i < answers.size() / 5; i++) {
            String[] question;
            for (int j = counter; j < counts; j++) {
                if (answers.get(j).equals("A")){
                    question = questions[count].split("", 2);
                    System.out.println(question[0]);
                    countA++;
                }else {
                    question = questions[count].split("5");
                    System.out.println(question[1]);
                    countB++;
                }
                count++;

            }
            count += 5;
            counter += 5;
            System.out.println("Number of A" + countA);
            System.out.println("Number of B" + countB);
            System.out.println();
            countA = 0;
            countB = 0;
        }
    }
    public static void extrovert(){
        for (int i = 0; i < answers.size(); i+=4) {
            if (answers.get(i).equals("A")){
                extrovert++;
            }
            else {
                introvert++;
            }
        }
        System.out.println("extrovert "+extrovert);
        System.out.println("introvert "+introvert);
    }

}