package Arraylist;

import java.util.ArrayList;

public class coutElement {
      public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        int size = list.size();
        System.out.println(size);

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
      }
}
