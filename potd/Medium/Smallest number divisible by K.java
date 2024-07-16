import java.util.* ;
import java.io.*; 
public class Solution {
	public static int lengthOfNumber(int k) {
		// Write your code here.
		if(k%2==0 || k%5==0)
			return -1;
		
		long n=0;

		for(int i=1; i<=k; i++){
			n=(n*10+1)%k;
			if(n==0)
				return i;
		}
		return -1;
	}
}
