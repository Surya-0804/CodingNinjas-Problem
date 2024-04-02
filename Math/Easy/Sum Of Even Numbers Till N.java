import java.util.* ;
import java.io.*; 
public class Solution {
	public static long evenSumTillN(int n) {
		// Write your code here.
		long sum=0;
		for(int i=2;i<=n;i+=2){
			sum+=i;
		}
		return sum;
	}
}
