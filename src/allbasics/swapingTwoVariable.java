package allbasics;
import java.util.*;
public class swapingTwoVariable {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the values for a and b");
	int sum=0;
	int a = scan.nextInt();
	int b =scan.nextInt();
	sum=a;
	a=b;
	b=sum;
	System.out.println("a value is :"+a+" b value is :"+b);
}
}
