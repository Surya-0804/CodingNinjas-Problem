import java.util.* ;
import java.io.*; 
public class Solution {
  public static int hotelBookings(List<String> queries)
  {
      // Write your code here.
      int coin=0;
      for(String key:queries){
        if(key.charAt(0)=='+'){
          coin++;
        }
      }
      return coin;
  }
}
