import java.util.* ;
import java.io.*; 
public class Solution {
    public static String reverseOnlyLetters(String s) {
        // Write your code here.
        char[] letter=s.toCharArray();
        StringBuilder sb=new StringBuilder(s);
        for(char ch : letter){
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
            }
        }
        sb.reverse();
        int index=0;
        for(int i=0; i<letter.length; i++){
            if(Character.isAlphabetic(letter[i])){
                letter[i]=(char)sb.charAt(index++);
                
            }
        }
        return new String(letter);

    }
}
