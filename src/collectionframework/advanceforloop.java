package collectionframework;

import java.util.ArrayList;

public class advanceforloop {

	public static void main(String[] args) {
		
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(Object x: al) //this for loop work for all collections.
		{
			System.out.print(x+" ");
		}
	}

}
