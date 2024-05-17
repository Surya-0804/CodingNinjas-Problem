import java.util.* ;
import java.io.*; 
public class Solution {
	public static int specialSum(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int answer=Integer.MAX_VALUE;
		int first=0;
		int last=0;
		for(int i=0 ; i<n ;i++){
			first+=arr.get(i);
			last+=arr.get(n-i-1);
			answer=Math.min(answer,last+first);
		}
		return answer;
	}
}

