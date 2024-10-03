package Arraylist;

import java.util.ArrayList;

public class addInBetween {
     public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.add(0,0);
        System.out.println(list);
     }

}
