public class avgvarargs {
    public static void main(String[] args) {
        System.out.println(avg(15,17,19,20));

    }
    static double avg(double... num){
        int sum= 0;
        for(double i:num){
            sum+=i;
        }
        return sum/ num.length;

    }
}
