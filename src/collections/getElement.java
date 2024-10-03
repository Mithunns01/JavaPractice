package Arraylist;

import java.util.ArrayList;

public class getElement {
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        int elenent = list.get(3);
        System.out.println(elenent);
    }
}
