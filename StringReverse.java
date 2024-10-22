package Core_Java_Fundamentals.StringAndArray_problems;

public class StringReverse {
    public static void main(String[] args) {
        String str = " hello word";
        String newS = " ";
        for (int i=0; i<str.length(); i++){
            newS = str.charAt(i) + newS;

            
        }
        System.out.println(newS);
    }
}
