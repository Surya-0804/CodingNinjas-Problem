import java.util.* ;
import java.io.*; 

class Solution {

  public static String stringReverse(char[] arr) {
    // Write your code here.
    StringBuilder s=new StringBuilder();
    for(int i=arr.length-1;i>=0;i--){
      s.append(arr[i]);
    }
    return s.toString();
  }
}
