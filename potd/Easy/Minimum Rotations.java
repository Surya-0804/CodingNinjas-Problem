import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumRotations(int n, String s) {
		// Write your code here.
		for(int i=1;i<n;i++){
			if(s.charAt(i)!=s.charAt(i-1))
				return s.length();
		}
		return 1;
	}

}
