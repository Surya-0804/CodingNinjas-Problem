import java.util.* ;
import java.io.*; 
public class Solution {
	public static boolean isPossibleToSplit(int n, int[] arr) {
		// Write your code here.
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:arr){
			if(map.containsKey(i)){
				map.put(i,map.get(i)+1);
			}
			else{
				map.put(i,1);
			}
		}
		int count=map.get(arr[0]);
		for(int num:map.values()){
			if(num!=count){
				return false;
			}
		}
		return count>1;

	}
}
