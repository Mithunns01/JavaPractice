package javapractice;

public class TowerOfHanoi {
    public static void TowerOfHanoip(int n, String string, String string2, String string3){
        if(n==1){
            System.out.println("trnsfer disk from "+n+" from "+string+" to "+string3);
            return;
        }
        TowerOfHanoip(n-1, string, string3, string2);
        System.out.println("trnsfer disk from "+n+" from "+string+" to "+string3);
        TowerOfHanoip(n-1, string2, string, string3);
        
    }
    public static void main(String [] args){
        int n = 3;
        TowerOfHanoip(n,"S","H","D");
    }
}
