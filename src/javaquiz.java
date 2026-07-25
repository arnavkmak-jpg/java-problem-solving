import java.util.Scanner;
public class javaquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int correct=0;

        System.out.println("***************");
        System.out.println("JAVA QUIZ GAME");
        System.out.println("***************");

        String[] questions = {"What year was the Java programming language first released?",
                "What does CPU stand for?",
                "What data structure uses FIFO (First In, First Out) ordering?",
                "What is the time complexity of binary search on a sorted array?",
                "Who is considered the first computer programmer in history?"};

        String[][] options = {{"1. 1991", "2. 1995", "3. 2000", "4. 2005"},
                {"1. Central Processing Unit", "2. Computer Processing Unit", "3. Central Program Unit", "4. Core Processing Unit"},
                {"1. Stack", "2. Queue", "3. Tree", "4. Graph"},
                {"1. O(n)", "2. O(log n)", "3. O(n^2)", "4. O(1)"},
                {"1. Alan Turing", "2. Charles Babbage", "3. Ada Lovelace", "4. Grace Hopper"}};

        int[] Answers = {2, 1, 2, 2, 3};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your choice(1,2,3,4): ");
            choice = scanner.nextInt();
            System.out.println("****************");
            System.out.println(checkAnswer(Answers[i],choice));
            System.out.println("****************");
            if (Answers[i]==choice){
                correct++;
            }
        }
        System.out.println("Toral correct answers = "+correct);
    }
    static String checkAnswer(int Answers,int choice) {
            if (Answers == choice) {
                return "CORRECT ANSWER";
            } else {
                return "WRONG ANSWER";
            }
        }
    }

