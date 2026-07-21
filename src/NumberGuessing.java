import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int attempt = 0;
        int num;

        int random_number = random.nextInt(1,101);

        System.out.println("Number Guessing Game");
        System.out.println("Guess the number between 1-100:");

        do{
            System.out.print("choose the number: ");
             num = scanner.nextInt();
            attempt++;
            if (num<random_number){
                System.out.println("TOO LOW!");
            }
            else if (num>random_number){
                System.out.println("TOO HIGH!");
            }
            System.out.println("Attempts Taken: "+attempt);

        }while(num!=random_number);

        System.out.println("You Win!");

    }
}


