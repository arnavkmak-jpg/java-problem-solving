package AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alarmTime;
        LocalTime time=null;

        while (time == null) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                System.out.print("Enter the time of alarm to be set(HH:MM:SS): ");
                alarmTime = scanner.nextLine();

                time = LocalTime.parse(alarmTime, formatter);

                System.out.println("Alarm set for time: "+time);
            } catch (DateTimeParseException e) {
                System.out.println("Incorrect Format, Please re enter"+"\n");

            }
        }
        AlarmClock alarmClock = new AlarmClock(time);
        Thread thread = new Thread(alarmClock);
        thread.start();

    }
}
