import java.util.* ;
import java.io.*; 
public class Solution {
	public static int stringMania(int n, int m, String str1, String str2) {
		// Write your code here.
		for(int i=0 ; i<Math.min(n,m) ; i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				return str1.charAt(i)>str2.charAt(i) ? 1 : -1;
			}
		}
		if(n==m){
			return 0;
		}else{
			return n>m ? 1: -1;
		}
	}
}
