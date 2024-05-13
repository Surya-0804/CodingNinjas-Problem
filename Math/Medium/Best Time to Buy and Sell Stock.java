import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int profit=0;
        int initial=prices.get(0);
        for(int i=1; i<prices.size() ; i++){
            int current=prices.get(i)-initial;
            profit=Math.max(current,profit);

            initial=Math.min(initial,prices.get(i));
        }

        return profit;
    }
}
