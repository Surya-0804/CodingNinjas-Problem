import java.util.* ;
import java.io.*; 
public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
	{
		// Write Your Code Here.
		ArrayList<Integer> result=new ArrayList<>();
		int i=0,j=0;
		while(i<n&&j<m){
			if( arr1.get(i).equals(arr2.get(j))== true ){
				result.add(arr1.get(i));
				i++;
				j++;
			}
			else if(arr1.get(i)>arr2.get(j)){
				j++;
			}
			else{
				i++;
			}
		}
		return result;
	}
}
