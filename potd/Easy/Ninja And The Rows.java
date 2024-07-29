import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maximumWeightRow(int n, int m, int[][] mat) {
        // Write your code here.
        int answer=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<m; j++){
                sum+=mat[i][j];
            }
            answer=Math.max(sum,answer);
        }
        return answer;
    }
}
