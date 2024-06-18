import java.util.* ;
import java.io.*; 
public class Solution {
	public static void print(int n) {
		// Write your code here.
		for(int i=0; i<n; i++){
			char ch=(i%2==0)? '1':'0';
			for(int j=0; j<n-i; j++){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
