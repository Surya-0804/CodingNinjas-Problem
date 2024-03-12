import java.util.* ;
import java.io.*; 
public class Solution {

	public static boolean checkPalindrome(String str) {
	
	    // WRITE YOUR CODE HERE	
		int left=0;
		int right=str.length()-1;
		while(left<right){
			while(left<right && !Character.isLetterOrDigit(str.charAt(left))){
				left++;
			}
			while(left<right && !Character.isLetterOrDigit(str.charAt(right))){
				right--;
			}
			char leftChar=Character.toLowerCase(str.charAt(left));
			char rightChar=Character.toLowerCase(str.charAt(right));
			while(leftChar!=rightChar){
				return false;
			}
			left++;
			right--;

		}
		return true;
	 
	}
}
