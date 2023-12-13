package lerm;

import java.util.Scanner;

public class uniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the String");
		String input=scan.nextLine();
		String[] words = input.split(" ");

      
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversed.append(reversedWord).append(" "); 
        }

        // Remove the trailing space
        if (reversed.length() > 0) {
            reversed.deleteCharAt(reversed.length() - 1);
        }

        // Print the reversed string
        System.out.println("Reversed string with spaces intact:");
        System.out.println(reversed.toString());

      
    }
}




