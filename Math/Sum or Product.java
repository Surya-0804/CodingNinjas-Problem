import java.util.* ;
import java.io.*; 
public class Solution {

	public static long sumOrProduct(int n, int q) {

		// Write your code here
		if(q==1){
			return n*(n+1)/2;
		}
		else{
			int mod=1000000007;
			long prod=1;
			for(int i=1;i<=n;i++){
				prod=(prod*i)%mod;
			}
			return prod;
		}
	}
}
