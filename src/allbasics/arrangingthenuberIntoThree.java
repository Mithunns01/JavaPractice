package allbasics;
import java.util.*;
public class arrangingthenuberIntoThree {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the value for to count");
	int count=scan.nextInt();
	for(int i=1;i<=4;i++) {
		for(int j=0;j<=4;j++) {
			for(int k=1;k<=4;k++) {
				if(i!=j && j!=k && i!=k) {
					int ans= i*100 +j*10 +k;
					System.out.println(ans);
				}
			}
		}
	}
}
}
