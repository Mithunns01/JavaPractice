package lerm;

import java.util.Scanner;

public class demo {
    public static void main(String []args) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter your name");
    	String name = scan.nextLine();
    	greet(name);
    	
    }
public static void greet(String name) {
	System.out.println("Hello "+name+" how are you");
	
}
}
