package javapractice;
import java.util.*;
public class recursion {
    public static void functionret(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        functionret(n-1);
    }
    public static void main( String []args){
        System.out.println("enter the number as yoy wish to be printed");
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        functionret(n);
        scan.close();
    }
}
