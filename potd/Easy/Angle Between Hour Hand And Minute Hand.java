import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAngle(int hour, int minute) {
        //Write your code here

        int answer=(int)Math.abs(180-Math.abs(180-Math.abs(minute*6-(hour*30+minute*0.5))));
        return answer;
    }
}
