import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSetBit(int n) {
		// WRITE YOUR CODE HERE
		String binary=Integer.toBinaryString(n);
		int count=0;
		int index=-1;
		for(int i=binary.length()-1;i>=0;i--){
			if(binary.charAt(i)=='1'){
				count++;
				if(count>1)
					return -1;
				index=binary.length()-i;
			}
		}
		return index;

	}
}
