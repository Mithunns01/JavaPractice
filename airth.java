package lerm;

import java.util.Scanner;

public class airth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter your fisrt number");
long num1=scan.nextLong();
System.out.println("enter second number");
long num2=scan.nextLong();
add(num1,  num2);
	}
public static void add(long num1, long num2) {
	System.out.println(num1+num2);
}
}
