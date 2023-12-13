package allbasics;

import java.util.Scanner;

public class hexadecimalConvertion {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value for to be converting");
	int a = scan.nextInt();
	String k = Integer.toHexString(a);
	System.out.println("the hexadecimal is :"+k);
}
}
