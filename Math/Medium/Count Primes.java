import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List< Integer > countPrimes(int n) {
        // Write your code here.
        List<Integer> answer=new ArrayList<>();
        for(int i=2;i<=n;i++){
            if(n%i==0&& isPrime(i))
                answer.add(i);
        }
        return answer;
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
