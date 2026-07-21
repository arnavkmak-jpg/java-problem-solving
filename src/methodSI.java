import java.util.Scanner;
public class methodSI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        double p = scanner.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r = scanner.nextDouble();
        System.out.println("Enter the time: ");
        double t = scanner.nextDouble();
        System.out.println("Simple Interest: "+ SI(p,r,t));
    }
    static double SI(double p, double r, double t){
        return (p*r*t)/100;
    }
}
