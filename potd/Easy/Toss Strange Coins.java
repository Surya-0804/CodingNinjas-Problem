import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static double tossStrangeCoins(ArrayList<Double> prob, int target)
	{
		// Write your code here
		 int n=prob.size();

        double[] dp=new double[target+1];

        dp[0]=1.0;

        for(int i=0;i<n;i++){

            for(int j=target;j>=0;j--){

                dp[j]=dp[j]*(1-prob.get(i));

                if(j>0) dp[j]+=dp[j-1]*prob.get(i);

            }

        }

        return dp[target];
	}
}

