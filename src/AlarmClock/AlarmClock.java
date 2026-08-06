package AlarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{
    Scanner scanner = new Scanner(System.in);

    private final LocalTime time;

    AlarmClock(LocalTime time){
        this.time=time;
    }
    @Override
    public void run() {

        try{
            while (LocalTime.now().isBefore(time)){
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                System.out.printf("\r%02d:%02d:%02d",hour,minute,second);
            }
        }catch (InterruptedException e){
            System.out.println("Thread interrupted");
        }
        System.out.println();
        String filepath = "src\\Athena Cykes - Courtroom Revolutionnaire.wav";
        File file = new File(filepath);
        try {
            AudioInputStream audio = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
            System.out.println("WAKE UP");
            System.out.print("Type Enter to stop the alarm: ");
            scanner.nextLine();
            clip.close();
            scanner.close();

        }catch (UnsupportedAudioFileException e){
            System.out.println("Unsupported audio file format");
        }catch (LineUnavailableException e){
            System.out.println("Line not available");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }




    }
}
