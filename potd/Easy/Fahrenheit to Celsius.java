import java.util.* ;
import java.io.*; 

public class Solution {

	public static List<List<Integer>> fahrenheitToCelsius(int s, int e, int w) {
		// Write your code here
		List<List<Integer>> result=new ArrayList<>();
		for(int i=s;i<=e;i+=w){
			List<Integer> sub=new ArrayList<>();
			sub.add(i);
			sub.add(celsius(i));
			result.add(sub);
		}
		return result;
	}

	private static int celsius(int x){
		return (int)((x-32)*5/9);
	}
}
