package allbasics;

import java.util.Scanner;

public class tableof8 {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("enter the nober ");
	 int a = scan.nextInt();
	 for(int i =0;i<=10;i++) {
		 int result=i*a;
	 System.out.println(a+" x "+i+" = "+result);
	 }
	 }
}
