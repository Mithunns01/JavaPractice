package collections;
import java.util.*;
public class Arraydeques {

	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("java");
		ad.add(true);
		ad.add(4.666f);
		System.out.println(ad);
		ad.addFirst(99);
		ad.addLast(100);
		System.out.println(ad);
	}

}
