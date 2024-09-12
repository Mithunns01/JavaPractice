package javapractice;
import java.util.*;
public class selectionsort {
    public static void arrcalc(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=scan.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements of an array");
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0; i<arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;

                }
            }
            int temp=arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }
        arrcalc(arr);
        scan.close();

    }
}
