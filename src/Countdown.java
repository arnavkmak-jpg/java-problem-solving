import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        Timer timer = new Timer();
        System.out.print("Enter the countdown number: ");
        num = scanner.nextInt();


        TimerTask task = new TimerTask() {
            int count=num;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count<=0){
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }


            }
        };
        timer.schedule(task,1000,1000);
    }
}
