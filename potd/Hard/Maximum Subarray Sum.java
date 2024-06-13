import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long answer=Long.MIN_VALUE;
		long sum=0;
		for(int num : arr){
			sum+=num;
			if(sum < 0)
				sum=0;
			answer=Math.max(answer,sum);
			
		}
		return answer;
	}

}
