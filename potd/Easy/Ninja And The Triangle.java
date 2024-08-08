import java.util.* ;
import java.io.*; 
public class Solution {
    public static int ninjaAndTriangle(int n) {
        // Write your code here.
        return (int)(-1+Math.sqrt(1-4*(-2*n)))/2;
    }
}
