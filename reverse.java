package Core_Java_Fundamentals.StringAndArray_problems;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringBuffer rev = new StringBuffer(s).reverse();
        System.out.println(s);
        System.out.println(s.toUpperCase());
        System.out.println(rev);
        scan.close();
    }
}
