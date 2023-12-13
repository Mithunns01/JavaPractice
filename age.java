package lerm;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your name ");
		String name=scan.nextLine();
		System.out.println("enter your age ");
		int yob=scan.nextInt();
		
		greet(name);
		cage(yob);
		System.out.println("youre age "+yob);
		

	}
	public static void greet(String name) {
		System.out.println("hello "+name+"how  are you");
	}
	public static int cage(int yob) {
		return 2023-yob;
	}

}
