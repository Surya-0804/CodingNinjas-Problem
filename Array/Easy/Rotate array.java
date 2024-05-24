import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        k=k%arr.size();
       
        reverse(arr, 0, k-1);

        reverse(arr, k, arr.size()-1);

        reverse(arr, 0, arr.size()-1);

        return arr;
    }

    private static void reverse(ArrayList<Integer> arr, int start , int end){
        while(start <end){
            int temp=arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
