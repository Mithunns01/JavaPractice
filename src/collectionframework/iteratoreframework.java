package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratoreframework {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Iterator itr = al.iterator();//there is specific iterator for the List that is the  ListIterator lst = al.listIterator;
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}

	}

}
