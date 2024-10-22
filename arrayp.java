package Core_Java_Fundamentals.StringAndArray_problems;

public class arrayp {
    public static void reverseString(int []arr){
        int Start = 10;
        int end = arr.length-1;
        while(Start < end){
            int temp = Start;
            arr[Start] = arr[end];
            arr[end] = temp;
            Start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
       
        reverseString(arr);
        for(int value : arr){
            System.out.print(value+" ");
        }
        System.out.println();

    }
}
