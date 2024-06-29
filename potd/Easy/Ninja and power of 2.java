import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		// Write your code here.
		ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
		int key=1; 
		for(int i=0; i<n ; i++){
			ArrayList<Integer> row=new ArrayList<>();
			for(int j=0; j<Math.pow(2,i); j++){
				if(key>9)
					key=1;
				row.add(key++);
			}
			row.add(-1);
			answer.add(row);
		}
		return answer;

	}
}
