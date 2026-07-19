import java.util.Scanner;

public class trafficlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char colour;

        System.out.print("Colour of the light (R,Y,G): ");
        colour = scanner.next().charAt(0);

        switch (colour){
            case 'R','r'-> System.out.println("STOP");
            case 'Y','y'-> System.out.println("SLOW DOWN");
            case 'G','g'-> System.out.println("GO");
            default -> System.out.println("INVALID SIGNAL");

        }

    }
}
