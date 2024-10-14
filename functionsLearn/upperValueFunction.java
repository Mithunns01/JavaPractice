package functionsLearn;
import  java.util.Scanner;

public class upperValueFunction {
    public static double up(double upper){
        return Math.ceil(upper);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double upper = scan.nextDouble();
        System.out.println(up(upper));
        scan.close();
    }
}
