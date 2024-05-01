import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int shakeHands(ArrayList<Integer> friends , int n, int k) {
        // Write your code here.
        for(int i : friends){
            if(i==k)
                k*=2;
        }
        return k;
    }
}
