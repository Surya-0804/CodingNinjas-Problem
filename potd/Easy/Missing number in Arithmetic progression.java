import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
        // Write your code here
        int diff=(arr[n-1]-arr[0])/n;        
        for(int i=0;i<n;i++){
            if(arr[i+1]-arr[i]!=diff){
                return arr[i]+diff;
            }
        }
        
        return -1 ;
    }
}

