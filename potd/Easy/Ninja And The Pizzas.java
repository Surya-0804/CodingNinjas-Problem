import java.util.* ;
import java.io.*; 
public class Solution {
	public static int maxExtraCheese(int n, int k, int[] l, int[] b) {
		// Write your code here.
		int answer=0;
		int[] list=new int[n];
		for(int i=0; i<n; i++){
			list[i]=Math.max(l[i], b[i]);
		}
		Arrays.sort(list);
		for(int i=0; i<k ; i++){
			answer += 2*list[n-1-i];
		}
		return answer;
	}
}
