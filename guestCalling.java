package javapractice;
import java.util.*;
public class guestCalling {
    public static int call(int n){
        if(n<=1){
            return 1;
        }
        int way1= call(n-1);

        int way2 = (n-1) * call(n-2);

        return way1 + way2;
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number of guest you ivited");
        int n = scan.nextInt();
        System.out.println(call(n));
        scan.close();

    }
}
