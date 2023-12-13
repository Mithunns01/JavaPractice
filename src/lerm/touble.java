package lerm;

import java.util.Scanner;

public class touble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the score");
		int num=scan.nextInt();
		System.out.println(trob(num));

	}
	public static int trob(int num) {
		return num*2;
	}

}
