package Core_Java_Fundamentals.StringAndArray_problems;
import java.util.Scanner;
public class Declear {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter the string to be modify");
        String s = Scan.nextLine();
         System.out.println(s.charAt(0)+""+s.toUpperCase());
         Scan.close();

    }
}
