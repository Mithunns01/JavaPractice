package javapractice;
import java.util.*;

public class xpowerN {
    public static int calpower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int power = calpower(x ,n-1);
        int power1=x*power;
        return power1;  
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the starting value of x");
        int x= scan.nextInt();
        System.out.println("enter the n the power");
        int n = scan.nextInt();
        System.out.println(calpower(x,n));
        scan.close();
    }
}
