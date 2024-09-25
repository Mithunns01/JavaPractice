package javapractice;
import java.util.*;
public class finsdaccurence {
    public static int first= -1;
    public static int last=-1;
    public static void accurence(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cuchar=str.charAt(idx);
        if(cuchar==element){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }
        }
        accurence(str, idx+1, element);
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the String to be revers");
        String str = scan.nextLine();
        accurence(str, 0, 'a');
        scan.close();
    }
}
