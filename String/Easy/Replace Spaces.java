import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		String tempStr = str.toString().replace(" ", "@40");
		return new StringBuilder(tempStr);
	}
}
