import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean isValidIPv4(String ipAddress) {
		// write your code here
		int count=0;
		String[] str=ipAddress.split("\\.");
		if(str.length != 4){
			return false;
		}
		for(int i=0; i<4;i++){
			try{
				int m=Integer.parseInt(str[i]);
				if(m>=0 && m<=255){
					count++;
				}
			}catch(NumberFormatException e){
				return false;
			}

		}
		if(count==4){
			return true;
		}
		return false;
	}

}
