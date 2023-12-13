package allbasics;

public class patternForAmericaFlag {
public static void main(String[] args) {
 int rows = 9;
 int cols = 11;
 for (int i = 0; i < rows; i++) {
     for (int j = 0; j < cols; j++) {
         if (i % 2 == 0) {
             System.out.print("* ");
         } else {
             if (j % 2 == 0) {
                 System.out.print("= ");
             } else {
                 System.out.print("  ");
             }
         }
     }
     System.out.println();
 }
}
}
