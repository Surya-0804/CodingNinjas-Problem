import java.util.* ;
import java.io.*; 
public class Solution {
  public static int sumOfMaxMin(int[] arr, int n) {
      // Write your code here.
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      for(int num:arr){
        if(num>max)
          max=num;
        if(num<min)
          min=num;
      }
      return max+min;
  }
}
