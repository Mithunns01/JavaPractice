package javapractice;

public class palindromic {
    public static boolean isPalindromic(String str){
        int left =0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(right) != str.charAt(left)){
                return false;
            }
            left++;
            right--;
        }
        return true;
               
    }
    public static void main(String [] argds){
        String str = "maddam";
        System.out.println("the given string is palindromic :"+ isPalindromic(str));
    }
}
