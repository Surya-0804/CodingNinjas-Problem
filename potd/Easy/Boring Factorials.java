import java.util.* ;
import java.io.*; 
public class Solution
{
    public static int boringFactorials(int n, int p)
    {
        // Write your code here.
        int answer=n;
        for(int i=n-1; i>=2; i--){
            answer=(answer*i)%p;
        }
        return answer%p;
    }
    
}
