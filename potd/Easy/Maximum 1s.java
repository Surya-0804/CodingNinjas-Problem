import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int maxOne(ArrayList<ArrayList<Integer>> arr) {

		// Write your code here
		
		int maxCount=0;
		int index=-1;
		for(int i=0; i<arr.size(); i++){
			int onesCount=0;
			for(int num: arr.get(i)){
				if(num==1)
					onesCount++;
			}
			if(maxCount<onesCount){
				maxCount=onesCount;
				index=i;
			}
		}
		return index;
	}
}
