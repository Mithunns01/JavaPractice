package javapractice;

public class fibonacciExtra {
    public static void main (String[] args){
        int n =10;
        int first = 0, second = 1;
        for(int i = 2;i < n; i++){
            int next = first + second;
            System.out.print(", "+next);
            first = second;
            second = next;
        }
        System.out.println();
    }
}
