package collections;
import java.util.*;
public class arralists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(34);
		al.add("java");
		al.add(453);
		System.out.println(al);
		al.add(2, 99);
		System.out.println(al);
		System.out.println("===========================");
		ArrayList at = new ArrayList();
		at.add(0);
		at.add(34);
		at.add(48);
		at.add(20);
		System.out.println(at);
		Collections.sort(at);
		System.out.println(at);
	}

}
