import java.util.* ;
import java.io.*; 
public class Solution {
    public static String findDivision(int x, int y, int n) {
        // Write your code here.
        boolean isNegitive= (x<0)^(y<0);
        x=Math.abs(x);
        y=Math.abs(y);

        StringBuilder sb=new StringBuilder();
        sb.append(x/y).append(".");
        int rem=x%y;

        for(int i=0; i<n; i++){
            rem*=10;
            sb.append(rem/y);
            rem=rem%y;
        }
        while(sb.length()-sb.indexOf(".")-1<n){
            sb.append("0");
        }
        if(isNegitive){
            sb.insert(0,"-");
        }
        return sb.toString();
    }
}
