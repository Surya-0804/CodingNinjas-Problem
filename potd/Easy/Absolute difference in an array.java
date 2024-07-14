import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> absDiff(ArrayList<Integer> arr, int n) {
		// Write your code here.
		ArrayList<Integer> answer=new ArrayList<>();
		int even=0;
		int odd=0;

		for(int i=0; i<n; i++){
			if(i%2==0){
				even=Math.abs(even-arr.get(i));
			}
			else{
				odd=Math.abs(odd-arr.get(i));
			}
		}
		answer.add(even);
		answer.add(odd);
		return answer;
	}
}
