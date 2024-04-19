import java.util.* ;
import java.io.*; 
public class Solution {
    public static String zigZagString(String str, int n, int m) {
        // Write your code here.
        if(m==1 || m>=str.length())
            return str;
        StringBuilder[] rows=new StringBuilder[m];

        for(int i=0;i<m;i++)
            rows[i]=new StringBuilder();
        
        int index=0,direction=1;
        for(char ch : str.toCharArray()){
            rows[index].append(ch);
            if(index==0)
                direction=1;
            else if(index== m-1)
                direction=-1;
            index+=direction;

        }
        StringBuilder answer=new StringBuilder();
        for(StringBuilder ch : rows){
            answer.append(ch);
        }

        return answer.toString();
    }
}
