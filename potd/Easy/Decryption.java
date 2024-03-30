import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static String decrypt(String message, ArrayList<ArrayList<Integer>> operations) {
		// Write your code here.
		int len=message.length();
		for(ArrayList<Integer> operation: operations){
			
			int times=operation.get(1)%len;
			int direction=operation.get(0);
			
			if(direction==-1){
				message= message.substring(times)+message.substring(0,times);
			}
			else{
				message= message.substring(len-times)+message.substring(0,len-times);
			}
		}
		return message;
	}

}
