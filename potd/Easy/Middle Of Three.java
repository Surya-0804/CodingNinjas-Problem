import java.util.* ;
import java.io.*; 
public class Solution {
	public static int middleOfThree(int x, int y, int z) {
		// Write your code here.
		if((x>=z && x<=y)||(x>=y&&x<=z))
			return x;
		else if((y>=z && y<=x)||(y>=x&&y<=z))
			return y;
		else
			return z;
	}
}
