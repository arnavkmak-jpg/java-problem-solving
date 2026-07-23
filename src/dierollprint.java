import java.util.Random;
import java.util.Scanner;

public class dierollprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count=0;
        int roll;

        System.out.print("Enter the times to roll: ");
        roll = scanner.nextInt();

        if(roll>0){
            for(int i=1;i<=roll;i++){
                int n = random.nextInt(1,7);
                dice(n);
                System.out.println("Your outcome is: "+n);
                count+=n;
            }
            System.out.println("Total of outcomes is: "+count);
        }
        else {
            System.out.println("Negative not allowed");
        }
    }
    static void dice(int n){
        String dice1= """
                 ---------
                |         |
                |    ●    |
                |         |
                 --------- 
                """;
        String dice2= """
                 ---------
                | ●       |
                |         |
                |       ● |
                 --------- 
                """;
        String dice3= """
                 ---------
                | ●       |
                |    ●    |
                |       ● |
                 --------- 
                """;
        String dice4= """
                 ---------
                | ●     ● |
                |         |
                | ●     ● |
                 --------- 
                """;
        String dice5= """
                 ---------
                | ●     ● |
                |    ●    |
                | ●     ● |
                 --------- 
                """;
        String dice6= """
                 ---------
                | ●     ● |
                | ●     ● |
                | ●     ● |
                 --------- 
                """;
        switch (n){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }

}
