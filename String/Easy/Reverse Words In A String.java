public class Solution 
{
	public static String reverseString(String str) 
	{
		//Write your code here
		String s[]=str.split(" ");
		String strNew="";
		for(int i=s.length-1;i>=0;i--){
			strNew+=s[i];
			if(i!=0){
				strNew+=" ";
			}
		}
		return strNew;
	}
}
