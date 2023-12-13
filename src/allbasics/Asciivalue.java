package allbasics;

import java.util.Scanner;

public class Asciivalue {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the value for ");
	char a =scan.next().charAt(0);
	int ascivalue = (int) a;
	System.out.println(ascivalue);
	System.out.println("enter the number to convert to char");
	int b= scan.nextInt();
	toAscii(b);
}
public static void toAscii( int b) {
	char t = (char) b;
	System.out.println(t);
}
}
