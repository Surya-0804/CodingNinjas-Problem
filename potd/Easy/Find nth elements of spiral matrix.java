import java.util.* ;
import java.io.*; 
public class Solution {

	public static int findKthElement(int[][] matrix, int k) {
	    // Write your code here.
		int i=0;
		int j=0;
		int n=matrix.length;
		int m=matrix[0].length;

		while(n>=1 && m>=1){
			if(k<=m){
				return matrix[i+0][j+k-1];
			}
			if(k<=(m+n-1)){
				return matrix[i+(k-m)][j+m-1];
			}
			if(k<=(m+n-1+m-1)){
				return matrix[i+n-1][j+m-1-(k-(m+n-1))];
			}
			if(k<=(m+n-1+m-1+n-2)){
				return matrix[i+n-1-(k-(n+m-1+m-1))][j+0];
			}

			k=k-(2*n+2*m-4);
			i++;
			j++;
			n=n-2;
			m=m-2;
		}
		return -1;
	}
}
