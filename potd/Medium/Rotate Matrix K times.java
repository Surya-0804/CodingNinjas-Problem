import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> arr, int k) {

        // Write your code here
        int n=arr.size();
        int m=arr.get(0).size();

        k=k%m;

        for(int i=0; i<n; i++){
            reverse(arr.get(i),0,m-1);
            reverse(arr.get(i),0,k-1);
            reverse(arr.get(i),k,m-1);
        }
        return arr;
    }
    private static void reverse(ArrayList<Integer> row, int start, int end){
        
        while(start<end){

            int temp=row.get(start);
            row.set(start,row.get(end));
            row.set(end,temp);

            start++;
            end--;
        }

    }
}
