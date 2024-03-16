import java.util.* ;
import java.io.*; 

class Solution {

  public static String stringReverse(char[] arr) {
    // Write your code here.
    String s="";
    for(int i=arr.length-1;i>=0;i--){
      s+=arr[i];
    }
    return s;
  }
}
