package allbasics;
import java.nio.charset.*;
public class charactersetavailable {
public static void main(String[] args) {
	 System.out.println("List of available character sets: ");
     
     // Iterate through the available character sets and print their names
     for (String str : Charset.availableCharsets().keySet()) {
         System.out.println(str);
     }
}
}
