import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean isReflectionEqual(String s) {
        // Write your code here.
        String mirror="AHIMOTUVWXY";

        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            if(!mirror.contains(String.valueOf(ch))){
                return false;
            }
        }        
        StringBuilder str=new StringBuilder(s).reverse();

        return s.equals(str.toString());
    }
}
