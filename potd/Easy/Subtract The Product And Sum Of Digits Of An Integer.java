import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findProductSumDifference(int n) {
        // Write your code here
        int product=1;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            product*=rem;
            n/=10;
        }
        return product-sum;
    }
}
