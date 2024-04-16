import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {

		// Write your code here
		ArrayList<Integer> answer=new ArrayList<>();
		for(int i=0;i<mat.size();i++){
			if(i%2==0){
				for(int j=0;j<mat.get(i).size();j++){
					answer.add(mat.get(i).get(j));
				}
			}
			else{
				for(int j=mat.get(i).size()-1;j>=0;j--){
					answer.add(mat.get(i).get(j));
				}
			}
		}
		return answer;
	}
}
