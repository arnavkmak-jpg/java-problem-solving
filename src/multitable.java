import java.util.Scanner;

public class multitable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
             result=num*i;
            System.out.printf("%dx%d = %d\n",num,i,result);
        }

        scanner.close();
    }
}