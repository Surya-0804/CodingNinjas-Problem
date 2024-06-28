import java.util.* ;
import java.io.*; 

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
		// Write your code here
		HashMap<Integer,Integer> map=new HashMap<>();
		ArrayList<Integer> answer=new ArrayList<>();
		int i=0,j=0,n=arr.size();

		while(j<n){
			map.put(arr.get(j),map.getOrDefault(arr.get(j),0)+1);

			if(j-i+1==k){
				answer.add(map.size());

				map.put(arr.get(i),map.get(arr.get(i))-1);

				if(map.get(arr.get(i))==0){
					map.remove(arr.get(i));
				}
				i++;
			}
			j++;
		}
		return answer;
	}
}
