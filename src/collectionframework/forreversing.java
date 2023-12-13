package collectionframework;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class forreversing {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		ListIterator dt = al.listIterator(al.size());
		while(dt.hasPrevious()) {
			System.out.print(dt.previous()+" ");
		}
	}

}
