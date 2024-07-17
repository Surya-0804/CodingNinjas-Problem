import java.util.* ;
import java.io.*; 
public class Solution 
{
    private static int maxDigit(int num){
        int max=Integer.MIN_VALUE;
        while(num>0){
            int rem=num%10;
            max=Math.max(max,rem);
            num/=10;
        }
        return max;
    }
    public static int concatLargestDigit(int a, int b, int c)
    {
        //    Write your code here.
        int answer=0;
        answer=answer*10+maxDigit(a);
        answer=answer*10+maxDigit(b);
        answer=answer*10+maxDigit(c);

        return answer;
        
    }
}
