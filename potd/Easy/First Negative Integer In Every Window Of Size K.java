import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> firstNegativeInteger(ArrayList<Integer> arr, int k, int n)
    {
        //    Write your code here.
        ArrayList<Integer> answer=new ArrayList<>();
        int firstNegativeIndex= 0;
        int firstNegativeNumber;
        for(int i=k-1; i<n; i++){
            while((firstNegativeIndex<i)&&(firstNegativeIndex<=i-k || arr.get(firstNegativeIndex)>=0)){
                firstNegativeIndex++;
            }

            if(arr.get(firstNegativeIndex)<0){
                firstNegativeNumber=arr.get(firstNegativeIndex);
            }
            else{
                firstNegativeNumber=0;
            }
            answer.add(firstNegativeNumber);
        }
        return answer;
    }
}
