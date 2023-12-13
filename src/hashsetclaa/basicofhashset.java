package hashsetclaa;
import java.util.*;
public class basicofhashset {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet();
		hs.add(24);
		hs.add(88);
		hs.add(88);
		hs.add(66);
		hs.add(73);
		hs.add(45);
		hs.add(null);
		System.out.println(hs);
		for(Object x: hs) //this for loop work for all collections.
		{
			System.out.print(x+" ");
		}
		System.out.println("========================");
		Iterator itr = hs.iterator();//there is specific iterator for the List that is the  ListIterator lst = al.listIterator;
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}


	}

}
