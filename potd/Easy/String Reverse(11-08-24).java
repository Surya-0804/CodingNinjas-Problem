import java.util.* ;

import sun.security.util.Length;

import java.io.*; 

class Solution {

  public static String stringReverse(char[] arr) {
    // Write your code here.
    StringBuilder sb=new StringBuilder();
    for(int i=arr.length-1; i>=0; i--){
      sb.append(arr[i]);
    }
    return sb.toString();

  }
}
