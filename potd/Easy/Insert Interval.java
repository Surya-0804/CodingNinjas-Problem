import java.util.* ;
import java.io.*; 
import java.util.*;

public class Solution 
{
    public static ArrayList<ArrayList<Integer>> insertInterval(ArrayList<ArrayList<Integer>> intervals, ArrayList<Integer> newInterval)
    {
        // Write your code here.
        int i=0;
        int n=intervals.size();
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        while(i<n && intervals.get(i).get(1) < newInterval.get(0)){
            result.add(intervals.get(i));
            i++;
        }

        while(i<n && intervals.get(i).get(0) <= newInterval.get(1)){
            newInterval.set(0,Math.min(intervals.get(i).get(0),newInterval.get(0)));
            newInterval.set(1,Math.max(intervals.get(i).get(1),newInterval.get(1)));
            i++;
        }
        result.add(newInterval);

        while(i<n){
            result.add(intervals.get(i));
            i++;
        }
        return result;
    }
}
