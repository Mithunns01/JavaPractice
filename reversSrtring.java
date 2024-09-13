package javapractice;
import java.util.*;
public class reversSrtring {
    public static void main(String []args){
        System.out.println("enter the string to be revers");
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        char[] chararr= str.toCharArray();
        int left=0;
        int right= chararr.length-1;

        while(left<right){
            char temp =  chararr[left];
            chararr[left]= chararr[right];
            chararr[right]= temp;
            left++;
            right--;
        }
        String revers = new String(chararr);
        System.out.println(revers);
        scan.close();
    }
}
