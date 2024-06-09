import java.util.* ;
import java.io.*; 
public class Solution
{
public static int minSubarraySum(ArrayList<Integer> arr, int n, int k)
    {
        // Write your code here.
        if(n ==0 || n<k)
            return 0;
        int sum=0;
        int answer=Integer.MAX_VALUE;
        for(int i=0; i<n ; i++){
            sum+=arr.get(i);
            if(i+1 >= k){
                answer=Math.min(answer,sum);
                sum-=arr.get(i+1 -k);
            }
        }
        return answer;
    }
}
