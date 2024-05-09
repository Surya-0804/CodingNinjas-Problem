import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
		// Write your code here.
		StringBuilder newStr=new StringBuilder();
		for(int i=str.length()-1 ; i>=0 ; i--){
			newStr.append(str.charAt(i));
		}
		return newStr.toString();
	}
}
