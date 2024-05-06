import java.util.* ;
import java.io.*; 
public class Solution {
	public static int middleOfThree(int x, int y, int z) {
		// Write your code here.
		int[] array={x,y,z};
		Arrays.sort(array);
		return array[1];
	}
}
