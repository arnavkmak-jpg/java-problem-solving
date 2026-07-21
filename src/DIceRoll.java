import java.util.Random;
import java.util.Scanner;

public class DIceRoll {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String response = "";
        String choice = "";

        System.out.println("DICE ROLL SIMULATION");

        do {

            int die = random.nextInt(1,7);
            System.out.println("You rolled a "+die);
            System.out.print("Roll the dice again? (yes/no): ");
            choice = scanner.nextLine();

        }while(choice.equals("yes"));


        scanner.close();
    }
}
