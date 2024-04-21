import java.util.* ;
import java.io.*; 

public class Solution {

	public static int digitProduct(int n) {
		// Write your code here.
		if(n<10)
			return n;
		
		StringBuilder answer=new StringBuilder();

		for(int digit=9;digit>=2;digit--){
			while(n%digit==0){
				answer.insert(0,digit);
				n/=digit;
			}
		}
		if(n>1)
			return -1;
		
		return Integer.parseInt(answer.toString());
	}

}
