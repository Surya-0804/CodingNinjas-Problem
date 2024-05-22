import java.util.* ;
import java.io.*; 
public class Solution {
    public static long titleToNumber(String str)
    {
        long result=0;
        for(char ch : str.toCharArray()){
            long num=ch-'A'+1;
            result=result*26+num;
        }
        return result;
    }
}
