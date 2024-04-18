import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> findAllSelfDividingNumbers(int lower, int upper) {
        // Write your code here.
        ArrayList<Integer> answer=new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            if(isSelfDividing(i))
                answer.add(i);
        }
        return answer;
    }
    private static boolean isSelfDividing(int n){
        int temp=n;
        while(temp>0){
            int digit=temp%10;
            if(digit==0 || n%digit!=0)
                return false;
            temp/=10;
        }
        return true;
    }
}
