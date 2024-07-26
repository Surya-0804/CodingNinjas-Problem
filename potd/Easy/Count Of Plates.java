import java.util.* ;
import java.io.*; 
public class Solution {

    public static boolean countPlatesOnTable(int n,int R,int r) {
        // Write your code here
        double pi=Math.PI;
        if(n==1 && r<=R || n==2 && r*2<=R || Math.asin((double)r/(R-r))<=pi/n)
            return true;
        
        return false;
    }


}
