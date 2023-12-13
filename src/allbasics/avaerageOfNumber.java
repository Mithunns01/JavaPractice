package allbasics;

import java.util.Scanner;

public class avaerageOfNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("how many number to be average");
	int n = scan.nextInt();
	if(n<=0) {
		return;
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		System.out.println("Enter the values to be average ");
		int num = scan.nextInt();
		sum +=num;
		}
	double average=(double) sum/n;
	System.out.println(average);
	}
 	
}
