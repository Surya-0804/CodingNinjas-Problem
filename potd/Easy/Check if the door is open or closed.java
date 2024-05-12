import java.util.* ;
import java.io.*; 
public class Solution {
    public static String doorStatus(int n) {
        // Write your code here.
        boolean[] doors=new boolean[n];
        for(int i=1; i<=n ; i++){
            for(int j=i-1 ; j<n ;j+=i){
                doors[j]=!doors[j];
            }
        }
        StringBuilder s=new StringBuilder();
        for(boolean i : doors){
            s.append(i? '1' : '0');
        }
        return s.toString();
    }
}
