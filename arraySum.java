package javapractice;
import java.util.Scanner;
public class arraySum {
    public static int[] arrSum(int []arr1, int arr2[] ){
        if(arr1.length != arr2.length){
            throw new IllegalArgumentException("array must be of same length");
        }

        int[] arr3 = new int[arr1.length];
        for(int i=0; i<arr1.length;i++){
            arr3[i] = arr1[i]+arr2[i];
        }
        return arr3;
    }
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
      
       System.out.println("enter the size of first array");
        int []arr1 = new int[scan.nextInt()];
        System.out.println("enter the first array element");
        for(int i=0;i<arr1.length;i++){
            arr1[i]= scan.nextInt();
        }

       System.out.println("enter the second element size it must be same size of first array");
        int []arr2 =new int[scan.nextInt()];
        System.out.println("Enter the second array element");
        for(int i=0;i<arr2.length;i++){
            arr2[i]= scan.nextInt();
        }

        for(int i=0; i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        for(int i=0; i< arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        
        for(int num :arrSum(arr1, arr2)){
            System.out.print(num+" ");
        }
        System.out.println();
        scan.close();
    }
}
