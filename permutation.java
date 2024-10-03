package javapractice;

public class permutation {
    public static void calper(String str, String permutaion){
        if(str.length() ==0){
            System.out.println(permutaion);
            return;
        }
        for(int i=0; i<str.length();i++){
            char curchar = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i+1);
            calper(newstr, permutaion+curchar);
        }
    }
    public static void main(String [] args){
        String str = "abc";
        calper(str, " ");
    }
}
