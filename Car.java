package binarysearch;

import java.util.Scanner;

class Car {
    public static int main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int marks = scan.nextInt();
		while(true) {
	if(marks>90) {
		System.out.println("s");
	}
	else if(marks>80&&marks==90) {
		System.out.println("a");
	}
	else if(marks>70&&marks==80) {
		System.out.println("b");
	}
	else if(marks>60&&marks==70) {
		System.out.println("c");
	}
	else if(marks>50&&marks==60) {
		System.out.println("d");
	}
	else if(marks>35&&marks==50) {
		System.out.println("e");
	}
	else
		System.out.println("f");
	return marks;
		}
    }
}