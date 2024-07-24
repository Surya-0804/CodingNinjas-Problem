import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static ArrayList<Integer> canCompleteChallenges(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> mat) 
    {
		// Write your code here.
		ArrayList<Integer> answer=new ArrayList<>(Collections.nCopies(mat.size(), 0));
		int[] a=new int[arr.size()];

		a[0]=arr.get(0);
		for(int i=1; i<arr.size(); i++){
			a[i]=a[i-1]+arr.get(i);
		}

		for(int m=0; m<mat.size(); m++){
			int i=mat.get(m).get(0);
			int j=mat.get(m).get(1);
			int k=mat.get(m).get(2);

			if(a[i]>j && (i<1 || a[i-1]<(j+1)*k))
				answer.set(m,1);
		}
		return answer;
	}

}
