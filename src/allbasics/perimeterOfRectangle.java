package allbasics;

import java.util.*;

public class perimeterOfRectangle {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value for the width and height");
	double width=scan.nextDouble();
	double height=scan.nextDouble();
	System.out.println("perimeter of rectanglr :"+reimeter(width,height));
	System.out.println("perimeter of rectanglr :"+area(width,height));
}

public static double reimeter(double width, double height) {
	return 2*(width*height);
}
public static double area(double width, double height) {
	return width*height;
}
}
