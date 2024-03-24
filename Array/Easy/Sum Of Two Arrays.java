import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] findArraySum(int[] a, int n, int[] b, int m) {
		// Write your code here.
		String s1="",s2="";
		for(int num:a){
			s1+=Integer.toString(num);
		}
		for(int num:b){
			s2+=Integer.toString(num);
		}
		int c=Integer.parseInt(s1)+Integer.parseInt(s2);
		String newstr=Integer.toString(c);
		int[] result=new int[newstr.length()];
		for(int i=0;i<newstr.length();i++){
			result[i]=Character.getNumericValue(newstr.charAt(i));
		}
		return result;
	}
}
