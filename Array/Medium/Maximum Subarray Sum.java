import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long answer=0;
		long sum=0;
		for(int num : arr){
			sum+=num;
			answer=Math.max(sum, answer);
			if(sum<0){
				sum=0;
			}
		}
		return answer;
	}

}
