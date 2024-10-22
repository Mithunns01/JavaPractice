package Core_Java_Fundamentals.StringAndArray_problems;

public class maximum {
    public static int findMax( int []arr){
        int max = arr[0];   
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i]; 
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 40, 5, 6};
        System.out.println(findMax(arr));
    }
}
