import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean isPeriodic(String s) {
        // Write your code here.
        int len=s.length();
        for(int i=1; i<=len/2; i++){
            boolean answer=true;
            for(int j=i; j<len; j++){
                if(s.charAt(j)!=s.charAt(j-i)){
                    answer=false;
                    break;
                }
            }
            if(answer)
                return true;
        }
        return false;
    }
}
