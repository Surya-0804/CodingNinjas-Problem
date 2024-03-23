import java.util.* ;
import java.io.*; 
public class Solution{
    public static int fibonacciNumber(int n){
        // Write your code here.
        if(n<2){
            return n;
        }
        int a=0,b=1,mod=(int)1e9+7;
        for(int i=2;i<=n;i++){
            int c=(a+b)%mod;
            a=b;
            b=c;
        }
        return b;       

    }
}
