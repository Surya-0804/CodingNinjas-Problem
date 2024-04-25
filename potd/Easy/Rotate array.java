import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        for(int i=0;i<k;i++){
            arr.add(arr.remove(0));
        }
        return arr;
    }
}
