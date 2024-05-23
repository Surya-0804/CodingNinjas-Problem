import java.math.BigInteger;

public class Solution {
	public static void factorial(int n) {
		// Write your code here
		BigInteger fact=BigInteger.ONE;
		for(int i=1; i<=n; i++){
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

	
}
