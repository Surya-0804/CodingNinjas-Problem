import java.util.* ;
import java.io.*; 

public class Solution {
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.
      int ceil=-1;
      int floor=-1;
      for(int num : a){
        if(num<=x && (floor == -1 || num > floor))
          floor=num;
        if(num>=x && (ceil == -1 || num < ceil)){
          ceil=num;
        }

      }
      return new int[]{floor,ceil};
    }
    
}
