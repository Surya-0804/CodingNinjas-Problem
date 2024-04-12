import java.util.* ;
import java.io.*; 

class Solution {

  public static int[] completeSum(int a[], int n) {
    // Write your code here.
    int[] answer=new int[n];
    int sum=0;
    Arrays.fill(answer,0);
    for(int i=0;i<n;i++){
      sum+=a[i];
      answer[i]=sum;
    }
    return answer;

  }
}
