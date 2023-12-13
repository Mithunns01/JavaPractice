package lerm;

import java.util.Scanner;

public class oper {

		// TODO Auto-generated method stub
public static void main(String[] args) {

			Scanner scan=new Scanner(System.in);

			System.out.println("Enter 2 numbers ");

			int num1=scan.nextInt();

			int num2=scan.nextInt();

			System.out.println(subtractNumbers(num1, num2));

			System.out.println("Enter 2 numbers ");

			num1=scan.nextInt();

			num2=scan.nextInt();

			System.out.println(multiplyNumbers(num1, num2));

			System.out.println("Enter 2 numbers ");

			num1=scan.nextInt();

			num2=scan.nextInt();

			System.out.println(divideNumbers(num1, num2));

			System.out.println("Enter 2 numbers ");

			num1=scan.nextInt();

			num2=scan.nextInt();

			System.out.println(findRemainder(num1, num2));

			}

			private static int findRemainder(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1%num2;
		}

			private static int divideNumbers(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1/num2;
		}

			private static int multiplyNumbers(int num1, int num2) {
			// TODO Auto-generated method stub
			return num1*num2;
		}

			public static int subtractNumbers(int num1, int num2)

			{

			return num2-num1;
			}

}	
