import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static boolean[] checkWordsInString(String s, int n, ArrayList<String> wordList) 
    {
        // Write your code here
        boolean[] answer=new boolean[wordList.size()];
        for(int i=0; i<wordList.size(); i++){
            String str=wordList.get(i);
            if(s.indexOf(str)!=-1){
                answer[i]=true;
            }else{
                answer[i]=false;
            }
        }
        return answer;
    }
}
