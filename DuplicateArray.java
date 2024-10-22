package Core_Java_Fundamentals.StringAndArray_problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class DuplicateArray {
    public static int[] removeDuplicates(int arr[]){
        Set<Integer> set = new LinkedHashSet<>();
        for(int num: arr) {
            set.add(num);
        }
        int [] result =  new int[set.size()];
        int i=0;
        for(int num : set){
            result[i++]= num;

        }
        return result;
    }
    @SuppressWarnings("unlikely-arg-type")

    public static boolean removeDuplicate(int arr[]){
        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(set)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,5,6,8,6,8,9};
       System.out.println( removeDuplicate(arr));
       System.out.println(removeDuplicates(arr));
       for (int num : removeDuplicates(arr)) {
        System.out.print(num + " ");
    }
    System.out.println();
    }
}
