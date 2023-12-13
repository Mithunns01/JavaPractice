package allbasics;
import java.util.*;
public class convertingIntotheBinaryNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value for the a and b");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int l=a+b;
	String c=Integer.toBinaryString(a);
	String d=Integer.toBinaryString(b);
	String m=Integer.toBinaryString(l);
	System.out.println("the decimal number for a And b is: " +c+" & "+d+" sumof two number is "+m);
	
	
	try {
		int v = Integer.parseInt(c,2);
		System.out.println(v);
		int z = Integer.parseInt(d,2);
		System.out.println(z);
		}catch(NumberFormatException e) {
			System.out.println("Invalid binary  number  . please enter the valid number");
		}
}
}
