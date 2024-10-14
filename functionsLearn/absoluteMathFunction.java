package functionsLearn;
import java.util.*;
public class absoluteMathFunction {
    public static int absolute(int absValue){
        if(absValue<=0){
            return Math.abs(absValue);
        }
        return absValue;
    }
    public static double distance(double x1, double x2, double y1, double y2){
        //i Know this is logicaly incorrect
        double totalDistance = Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2);
        return totalDistance;
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
       
       /*System.out.println("enter the value");
        int absValue = scan.nextInt();
        System.out.println(absolute(absValue)); */ 
        
        //exaple of Distance between two points
        System.out.println("enter the distance of starting point");
        double x1 = scan.nextDouble();
        System.out.println("enter the distance of ending point");
        double x2 = scan.nextDouble();
        System.out.println("enter the distance of starting point");
        double y1 = scan.nextDouble();
        System.out.println("enter the distance of ending point");
        double y2 = scan.nextDouble();
        System.out.println("the average distance is : "+distance(x1, x2, y1, y2));
        scan.close();
    }
    
}
