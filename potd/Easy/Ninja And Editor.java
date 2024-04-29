import java.util.* ;
import java.io.*; 
public class Solution {
    public static String editSentence(String str){
        // Write your code here.
        StringBuilder answer=new StringBuilder();
        int i=0;
        for(char ch : str.toCharArray() ){
            if(Character.isUpperCase(ch)){
                if(i==0)
                    answer.append(Character.toLowerCase(ch));
                else{
                    answer.append(" ");
                    answer.append(Character.toLowerCase(ch));
                }
            }
            else{
                answer.append(ch);
            }
            i++;
        }
        return answer.toString();
    }
}
