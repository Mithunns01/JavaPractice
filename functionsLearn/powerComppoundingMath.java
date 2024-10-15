package functionsLearn;
import java.util.Scanner;
public class powerComppoundingMath {
    public static double compound(double  principal, double rate, double y) {
        double result = principal * Math.pow(1+rate, y);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the principal amount you ivested");
        double principal = scan.nextDouble();
        System.out.println("enter the rate of intrest per anum ");
        double rate = scan.nextDouble();
        System.out.println("enter the details how many years you are planning for");
        double y = scan .nextDouble();
        System.out.println("invested "+principal+" total returns "+compound(principal, rate, y)+" in total  of "+y+" years");
        scan.close();

    }
}
