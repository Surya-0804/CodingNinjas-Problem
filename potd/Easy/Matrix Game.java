import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static boolean matrixGame(ArrayList<ArrayList<Integer>> arr) {
		// Write your code here
		int n=arr.size();
		ArrayList<ArrayList<Integer>> result=multiply(arr);
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(!arr.get(i).get(j).equals(result.get(i).get(j)))
					return false;
			}
		}
		return true;
	}

	private static ArrayList<ArrayList<Integer>> multiply(ArrayList<ArrayList<Integer>> arr){
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		int n=arr.size();
		for(int i=0; i<n; i++){
			ArrayList<Integer> row=new ArrayList<>(Collections.nCopies(n, 0));
			result.add(row);
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n;j++){
				for(int k=0; k<n; k++){
					result.get(i).set(j,result.get(i).get(j)+ arr.get(i).get(k)*arr.get(k).get(j));
				}
			}
		}
		return result;
	}
}
