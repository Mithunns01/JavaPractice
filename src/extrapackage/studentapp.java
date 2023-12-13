package extrapackage;
import java.util.*;
public class studentapp {
public static void main(String[] args) {
	student s1 = new student(1 ,"mithun", 88.8f);
	student s2 = new student(2, "MithunNS", 99.4f);
	student s3 = new student (3, "mithu", 88.5f);
	ArrayList al=new ArrayList();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	System.out.println(al);
	
}
}
