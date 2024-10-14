package functionsLearn;
import java.util.Scanner;
public class roundofMathfunction {
    public static int round(double money){
        int roundMoney = Math.round((int)money);
        return roundMoney;
    }
    public static void main(String[] args) {
        // round off of money paisa into rupees because we cant  have paisa in rupees  
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amout take from customer to round off");
        double money = scan.nextDouble();
        System.out.println("Rounded amount is :"+round(money));
        scan.close();
    }
}
