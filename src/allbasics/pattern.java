package allbasics;

public class pattern {
public static void main(String[] args) {
	 for (int i = 0; i < 4; i++) {
         for (int j = 0; j < 4 - i; j++) {
             System.out.print(" ");
         }
         System.out.print("J");
         for (int j = 0; j < i; j++) {
             System.out.print(" ");
         }
         System.out.print("a");
         for (int j = 0; j < 2 * (3 - i); j++) {
             System.out.print(" ");
         }
         System.out.print("v");

         for (int j = 0; j < i; j++) {
             System.out.print(" ");
         }
         System.out.print("a");

         System.out.println();
	}
}
}
