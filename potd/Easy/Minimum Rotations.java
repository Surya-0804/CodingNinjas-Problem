import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumRotations(int n, String s) {
		// Write your code here.
		String temp=s;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			temp=temp.substring(n-1)+temp.substring(0,n-1);
			if(temp.equals(s)){
				min=Math.min(min,i+1);
			}
		}
		return min;
	}

}
