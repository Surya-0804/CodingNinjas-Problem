import java.util.* ;
import java.io.*; 
public class Solution {
	public static int firstMissing(int[] arr, int n) {
		// Write your code here.
		boolean [] present=new boolean[n+1];
		for(int i : arr){
			if(i>0 && i<=n)
				present[i]=true;
		}		
		int val=1;
		while(val<=n && present[val]){
			val++;
		}
		return val;
	}
}
