import java.util.ArrayList;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sum=0;
        ArrayList<Integer> num = new ArrayList<>();

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i<=size;i++){
            System.out.print("Enter number "+i+": ");
            int input = scanner.nextInt();
            num.add(input);
            sum+=input;
        }
        int average = sum/size;
        System.out.println(num);
        System.out.println("The sum of numbers is given as: "+sum);
        System.out.println("The average of the numbers is given as: "+average);

    }
}
