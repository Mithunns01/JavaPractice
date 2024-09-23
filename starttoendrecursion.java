package javapractice;
import java.util.*;
public class starttoendrecursion {
    public static void printnum(int n){
       
        
        
        if(n==6){
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        
        int n=1;
       printnum(n);
       scan.close();

    }
}
