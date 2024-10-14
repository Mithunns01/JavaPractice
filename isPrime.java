package javapractice;
import java.util.Scanner;
public class isPrime {
    public static boolean isPri(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number to be check is prime or not");
        int n = scan.nextInt();
        System.out.println(isPri(n));
        scan.close();
    }
}
