package collections;
import java.util.*;
public class prioriityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
		pq.add(40);
		pq.add(30);
		pq.add(20);
		pq.add(50);
		System.out.println(pq);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		PriorityQueue dq = new PriorityQueue();
		dq.add("css");
		dq.add("java");
		dq.add("Html");
		dq.add("pythin");
		dq.add("c");
		System.out.println(dq);
		//generics-for store perticular tyoe of data type
		PriorityQueue<Integer> aq = new PriorityQueue<Integer>();
		System.out.println("+++++++++++++++============================");
		aq.add(10);
		System.out.println(aq);
		
	}

}
