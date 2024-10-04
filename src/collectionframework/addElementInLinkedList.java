package linkedList;
import java.util.*;
public class addElementInLinkedList {
  public static void main(String [] args){
    LinkedList<String> list = new LinkedList<String>();

    list.addFirst("this");
    list.addFirst("is"); 

    System.out.println(list);

    list.addLast("list");

    System.out.println(list);

  }
    
}
