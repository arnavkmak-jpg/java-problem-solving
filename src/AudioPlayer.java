import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) {
        String choice = "";
        String filepath = "src\\Simon Blackquill - Twisted Swordsmanship.wav";
        File file = new File(filepath);
        Scanner scanner =new Scanner(System.in);

        try (AudioInputStream audio = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            while (!choice.equals("q")){
                System.out.println("P to Play");
                System.out.println("S to Stop");
                System.out.println("R to Reset");
                System.out.println("L to loop");
                System.out.println("K to disable loop");
                System.out.println("Q to Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextLine().toLowerCase();
                System.out.println();
                switch (choice){
                    case "p"-> clip.start();
                    case "s"-> clip.stop();
                    case "r"-> clip.setMicrosecondPosition(0);
                    case "q"-> clip.close();
                    case "l"-> clip.loop(Clip.LOOP_CONTINUOUSLY);
                    case "k"-> clip.loop(0);
                    default -> System.out.println("Invalid Input!");

            }


            }

        }
        catch (FileNotFoundException e){
            System.out.println("Incorrect file path");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Thank You!");
            scanner.close();

        }


    }

}
