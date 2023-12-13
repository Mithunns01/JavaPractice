package allbasics;
import java.util.*;

public class hexagonarea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double s = scan.nextDouble();
		double n = scan.nextDouble();
		System.out.println(area(s,n));
	}
public static double area(double s, double n) {
	return (n*(s*s))/(4*Math.tan(Math.PI)/n);
}
}
