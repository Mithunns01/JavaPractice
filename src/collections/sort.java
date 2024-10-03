package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
     public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(40);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
     }
     
}
