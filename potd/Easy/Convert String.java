import java.util.* ;
import java.io.*; 
public class Solution{
	public static String convertString(String str) {
            // Write your code here
            String[] words=str.split("\\s+");
            for(int i=0;i<words.length;i++){
                String word=words[i];
                if(!word.isEmpty()){
                    char first=Character.toUpperCase(word.charAt(0));
                    words[i]=first+word.substring(1);
                }
            }
            return String.join(" ",words);
        }

}
