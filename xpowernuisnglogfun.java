package javapractice;
import java.util.*;
public class xpowernuisnglogfun {
    public static int powerlog(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // for even number
        if(n%2==0){
           return powerlog(x, n/2) *powerlog(x, n/2);
        }else{
            return powerlog(x, n/2) * powerlog(x, n/2) * x;
        }
    }
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the base number");
        int n= scan.nextInt();
        System.out.println("Enter the power");
        int x=scan.nextInt();
        System.out.println(powerlog(x,n));
    }
}
