package functionsLearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxMinFunction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.println("enter the how many subject you have");
        int n = scan.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("enter the subjects name"+(i+1)+":");
            String subjectName = scan.next();
            
            System.out.println("enter the subject score "+subjectName+":"); 
            int score = scan.nextInt();
            scan.nextLine();

            map.put(subjectName, score);
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("Subject: " + entry.getKey() + ", score: " + entry.getValue());
            
        }

        System.out.println("Subject Scores:");
        for (int score : map.values()) {
            System.out.println("Score: " + score);

        }
        
        int maximumScore = Integer.MIN_VALUE;
        for(int score : map.values()){
            maximumScore = Math.max(maximumScore, score);
        }
        System.out.println("maximum score is : "+maximumScore);
    }
}
