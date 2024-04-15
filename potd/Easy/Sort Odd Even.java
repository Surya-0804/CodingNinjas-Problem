import java.util.* ;
import java.io.*; 
public class Solution {
	public static void sortOddEven(int[] nums) {
		// Write your code here.
		ArrayList<Integer> odd=new ArrayList<>();
		ArrayList<Integer> even=new ArrayList<>();
		for(int i:nums){
			if(i%2==0)
				even.add(i);
			else
				odd.add(i);
		}
		Collections.sort(even);
		Collections.sort(odd,Collections.reverseOrder());
		int i=0;
		for(int o:odd){
			nums[i++]=o;
		}
		for(int e:even){
			nums[i++]=e;
		}
	}
}
