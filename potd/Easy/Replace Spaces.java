import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 32){
				str.replace(i,i+1,"@40");
			}
		}
		return str;
	}
}
