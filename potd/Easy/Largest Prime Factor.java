import java.util.* ;
import java.io.*; 
public class Solution {
    public static int largestPrimeFactor(int n) {
        // Write your code here.
        if(n<2)
            return -1;
        int answer=0;
        for(int i=2; i*i<=n;i++){
            while(n%i==0){
                answer=Math.max(answer, i);
                n/=i;
            }
        }
        if(n>1){
            answer=n;
        }
        return answer;
    }
}
