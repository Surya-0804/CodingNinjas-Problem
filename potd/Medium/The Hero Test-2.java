import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> theOrder(int n, int k) {
		// Write your code here.
		ArrayList<Integer> answer=new ArrayList<Integer>();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=1; i<=n; i++){
			arr.add(i);
		}
		int index=0;
		while(!arr.isEmpty()){
			index=(index+k)%arr.size();
			answer.add(arr.get(index));
			arr.remove(index);	
		}
		return answer;
	}
}

