import java.util.* ;
import java.io.*; 
public class Solution {
    public static String maximumDifference(int n, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int result=Math.abs(arr[0]-arr[n-1]);
        return result%2==0?"EVEN":"ODD";
    }
}
