import java.util.* ;
import java.io.*; 
public class Solution
{
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
    {
        // Write your code here.
        int carry=1;
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            int sum=arr.get(i)+carry;
            answer.add(0,sum%10);
            carry=sum/10;
        }
        if(carry>0)
            answer.add(0,carry);
        while(!answer.isEmpty() && answer.get(0)==0)
            answer.remove(0);
        if(answer.size()==0)
            answer.add(0);
        return answer;
    }
}
