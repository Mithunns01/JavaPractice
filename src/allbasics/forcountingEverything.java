package allbasics;
import java.util.*;
public class forcountingEverything {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the string to be sorting");
	String a = scan.nextLine();
	count(a);
}
public static void count(String x) {
	char[] ch=x.toCharArray();
	
	int letter=0;
	int space=0;
	int num=0;
	int other=0;
	for(int i =0;i<x.length();i++) {
		if(Character.isLetter(ch[i])) {
			letter++;
		}
		else if(Character.isDigit(ch[i])) {
			num++;
		}
		else if(Character.isSpace(ch[i])) {
			space++;
		}
		else {
			other++;
		}
	}
	System.out.println("display the all string"+x);
	
	System.out.println("the total nummber of letter: "+letter);
	System.out.println("the total number of space: "+space);
	System.out.println("the total number of number:"+space);
	System.out.println("the total number of other: "+other);
}

}
