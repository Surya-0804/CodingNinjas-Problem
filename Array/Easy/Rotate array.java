import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=k ; i<arr.size() ; i++){
            answer.add(arr.get(i));
        }
        for(int i=0; i<k; i++)
            answer.add(arr.get(i));
        
        return answer;
        
    }
}
