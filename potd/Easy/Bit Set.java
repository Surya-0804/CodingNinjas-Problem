import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findFirstRepeatingDigit(String digitPattern) {
        // Write your code here.
        HashSet<Character> set=new HashSet<>();
        for(char ch : digitPattern.toCharArray()){
            if(set.contains(ch))
                return ch-'0';
            set.add(ch);
        }
        return -1;
    }
}
