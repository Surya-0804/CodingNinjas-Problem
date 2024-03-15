import java.util.* ;
import java.io.*; 

public class Solution {
	public static int findInteger(int n, int k) {
		// Write your code here
		if(k<=(n+1)/2){
			return 2*k-1;
		}
		else{
			return 2*(k-(n+1)/2);
		}
	}

}
