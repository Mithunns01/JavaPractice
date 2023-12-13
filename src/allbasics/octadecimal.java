package allbasics;
import java.util.*;
public class octadecimal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value to convert");
		int a = scan.nextInt();
		String b= Integer.toOctalString(a);
		
		System.out.println("to converting octa decimal"+b);
		
	}

}
