import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int flipSomeBits(int num, int[] arr, int n) {
		// Write your code here.
		String binary=String.format("%32s",Integer.toBinaryString(num)).replace(' ', '0');
		StringBuilder bin=new StringBuilder(binary);
		bin.reverse();
		for(int i : arr){
			bin.setCharAt(i-1,(bin.charAt(i-1)=='0')? '1':'0');
		}
		bin.reverse();
		return Integer.parseInt(bin.toString(),2);
	}
	
}	
