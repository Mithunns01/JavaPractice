
package collectionframework;
import java.util.*;
public class arraylistusingfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(int i=0;i<=al.size()-1;i++) {
			System.err.print(al.get(i)+" ");//we  can't use get for deque,queue,map
			
		}
	}

}
