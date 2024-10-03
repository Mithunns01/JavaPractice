package javapractice;
import java.util.*;
public class placeTiles {
    public static int tiles(int n, int m){
        if(n==m){
            return 2;
            
        }
        if(n<m){
            return 1;
        }
        int verticalPattern = tiles(n-m, m);
        
        int horizontalPattern = tiles(n-1, m);

        return verticalPattern + horizontalPattern;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the end point of tile it means n");
        int n = scan.nextInt();
        System.out.println(" enter the value for end point of m");
        int m = scan.nextInt();
        System.out.println(tiles(n, m));
        scan.close();
    }
}
