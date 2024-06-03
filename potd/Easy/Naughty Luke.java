import java.util.*;
import java.io.*;

public class Solution {
    public static int[][] getFinalGrid(int a[][], int n) {
        // Write your code here.
        for(int i=0; i<n; i++){
            int k=n-1;
            for(int j=0; j<=k; j++){
                int temp=a[i][j];
                a[i][j]=a[i][k]==1?0:1;
                a[i][k]=temp==1?0:1;
                k--;
            }
        }
        return a;

    }
}
