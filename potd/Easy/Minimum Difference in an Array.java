import java.util.* ;
import java.io.*; 


public class Solution {

    static int minDiff(int n, int[] arr) {
        // Write your code here.
        Arrays.sort(arr);
        int minDif=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            int diff=Math.abs(arr[i]-arr[i-1]);
            minDif=Math.min(minDif,diff);
        }
        return minDif;
    }
}
