package allbasics;
import java.util.*;
public class coputesumoftwointeger {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number to be compute");
	int number =scan.nextInt();
	int realnumber = number;
	int sum=0;
	while(number!=0) {
		int digit = number%10;
		sum+=digit;
		number/=10;
	}
	System.out.println("sum of digits in "+realnumber+" is "+sum);
}
}
