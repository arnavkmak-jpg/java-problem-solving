import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        String again;
        boolean tryAgain = true;
        boolean validinput=false;
        String[] fuit;
        do {
            System.out.println("**************");
            System.out.println("SLOT MACHINE");
            System.out.println("**************");
            System.out.println("AVAILABLE SYMBOLS:");
            System.out.println("🍒x2🍉x3🍋x5🔔x10⭐x20 if 3 matches");
            System.out.println("🍒x1🍉x2🍋x3🔔x5⭐x10 if 2 matches");
            System.out.println("Current balance = $"+balance);
            System.out.print("Enter the amount to bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if (bet>balance){
                System.out.println("Insufficient Balance");
            }
            else if (bet<=0){
                System.out.println("bet amount should be greater than 0");
            }
            else {
                System.out.println("Spinning... ");
                balance-=bet;
                fuit =slots();
                System.out.println(fuit[0]+"|"+fuit[1]+"|"+fuit[2]+"|");
                int payout = payroll(fuit,bet);
                if (payout>0){
                    balance+=payout;
                    System.out.println("Payout = $"+payout);
                }
                else {
                    System.out.println("Sorry you lost this round");
                }
                System.out.println("Current balance = $"+balance);
            validinput=false;
            }
            while (!validinput){
                System.out.print("SPIN AGAIN?(Y/N): ");
                again = scanner.nextLine().toUpperCase();
                if (again.equals("Y")){
                    tryAgain = true;
                    validinput = true;
                }
                else if (again.equals("N")){
                    tryAgain = false;
                    validinput = true;
                }
                else {
                    System.out.println("INVALID INPUT");
                }

            }

        }while (tryAgain);
    }
    static String[] slots(){
        Random random = new Random();
        String[] syms = {"🍒","🍉","🍋","🔔","⭐"};
        String[] fuit = new String[3];
        for (int i=0;i< fuit.length;i++){
            fuit[i] = syms[random.nextInt(syms.length)];

        }
        return fuit;

        }
        static int payroll(String[] fuit,int bet){
        if(fuit[0].equals(fuit[1])&&fuit[1].equals(fuit[2])){
            return switch (fuit[0]){
                case "🍒"-> bet*2;
                case "🍉"-> bet*3;
                case "🍋"-> bet*5;
                case "🔔"-> bet*10;
                case "⭐"-> bet*20;
                default -> 0;
            };
        }
        else if(fuit[0].equals(fuit[1])|| fuit[0].equals(fuit[2])){
            return switch (fuit[0]){
                case "🍒"-> bet*1;
                case "🍉"-> bet*2;
                case "🍋"-> bet*3;
                case "🔔"-> bet*5;
                case "⭐"-> bet*10;
                default -> 0;
            };
        }
        else if(fuit[1].equals(fuit[2])) {
            return switch (fuit[1]) {
                case "🍒" -> bet * 1;
                case "🍉" -> bet * 2;
                case "🍋" -> bet * 3;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }

}

