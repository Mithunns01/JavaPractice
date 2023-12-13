package allbasics;
import java.util.*;
public class ReversingString {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the string to reverse");
	char[] letter =scan.nextLine().toCharArray();
	System.out.println("the string to started to reverse");
	for(int i=letter.length-1;i>=0;i--) {
		System.out.print(letter[i]);
	}
	
}
}
