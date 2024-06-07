import java.util.* ;
import java.io.*; 
public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
        int count=0;
        int i=0; 
        int j=n-1;
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
            else{
                count++;
                i++;
                j--;
            }
        }
        return count==0? -1: count;
    }
}
