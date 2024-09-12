package javapractice;
import java.util.*;
public class insertionSort {
    public static void cal(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = scan.nextInt();
        System.out.println(" enter the array element ");
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j]){
            arr[j+1]=arr[j];
            j--;
            }
            arr[j+1]=current;
        }
        cal(arr);
        scan.close();
      
    }
   
}
