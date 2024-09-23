package javapractice;
import java.util.*;
public class fibonacci {
    public static void calfib(int a, int b, int n){
        if(n==0){
            return;
        }
         int c=a+b;
         System.out.println(c);
         calfib(b, c, n-1);
    }
    public static void main(String [] args){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(" enter the last term");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        calfib(a, b, n-2);
        scan.close();

    }
}
