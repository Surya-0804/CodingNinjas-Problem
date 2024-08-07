import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean amicablePair(int x, int y){
        // Write your code here.
        int xSum=1;
        int ySum=1;

        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                xSum+=i;
                if(i != x/i)
                    xSum+=x/i;
            }
        }
        for(int i=2; i<=Math.sqrt(y); i++){
            if(y%i==0){
                ySum+=i;
                if(i!=y/i)
                    ySum+=y/i;
            }
        }
        return (ySum==x)&&(xSum==y);
    }
}
