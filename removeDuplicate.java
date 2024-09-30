package javapractice;

public class removeDuplicate {
    public static boolean[] map = new boolean[26];
    public static void RemoveDup(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currcharr = str.charAt(idx);
        if(map[ currcharr - 'a']){
            RemoveDup(str, idx+1, newString);
        }else{
            newString+= currcharr;
            map[currcharr - 'a']=true;
            RemoveDup(str, idx+1, newString);
        }
    }
    public static void main(String [] args){
        String str = "abcdabcdbdbdbd";
        RemoveDup(str, 0, "");
    }
}
