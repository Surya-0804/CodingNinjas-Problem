import java.util.* ;
import java.io.*; 
public class Solution {

	public static int minimumCost(ArrayList<Integer> rowCost, ArrayList<Integer> colCost, int l, int w) {
		// Write your code here.
		Collections.sort(rowCost);
		Collections.sort(colCost);
		int i=l-2;
		int j=w-2;
		int v=1;
		int h=1;

		int ans = 0;

		while (i >= 0 && j >= 0){
			if(rowCost.get(i) > colCost.get(j)){
				ans += rowCost.get(i) * v;
				i--;
				h++;
			} else{
				ans += colCost.get(j) * h;
				j--;
				v++;
			}
		}
		while ( i >=0){
			ans += rowCost.get(i) * v;
			i--;
			h++;
		}
		while (j >= 0){
			ans += colCost.get(j) * h;
			j--;
			v++;
		}

		return ans;
	}

}
