import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findMSB(int n) {
        // Write your code here.
        if((n &(n-1))==0)
            return n;
        int msb=0;
        while(n>1){
            n=n>>1;
            msb++;
        }
        return 1<<msb;
    }
    
}
