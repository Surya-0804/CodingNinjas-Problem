import java.util.* ;
import java.io.*; 
public class Solution {
    public static String maximumDifference(int n, int[] arr) {
        // Write your code here.
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num : arr){
            min=Math.min(min, num);
            max=Math.max(max, num);
        }
        return (max-min)%2==0 ? "EVEN" : "ODD";
    }
}
