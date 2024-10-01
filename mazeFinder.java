package javapractice;
import java.util.*;
public class mazeFinder {
    public static int maze(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
       int downside =  maze(i+1, j, n, m);
      
       
       int rightside = maze(i, j+1, n, m);

       return downside+rightside;
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value for first node of maze matrix");
        int n= scan.nextInt();
        System.out.println("enter the valur for last node of maze matrix ");
        int m= scan.nextInt();
        System.out.println(maze(0, 0, n, m));
        scan.close();
    }
}
