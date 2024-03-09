import java.util.ArrayList;
import java.util.HashSet;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		HashSet<Integer> set=new HashSet<>();
		for(int num:arr){
			if(set.contains(num)){
				return num;
			}
			else{
				set.add(num);
			}
		}
		return -1;
	}
}
