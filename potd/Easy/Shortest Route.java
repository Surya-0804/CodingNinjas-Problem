import java.util.* ;
import java.io.*; 
public class Solution {
    public static String findShortestRoute(String str) {
        // Write your code here.

        int x=0;
        int y=0;

        for(char ch : str.toCharArray()){
            if(ch=='E')
                x++;
            if(ch=='W')
                x--;
            if(ch=='N')
                y++;
            if(ch=='S')
                y--;
        }

        StringBuilder answer=new StringBuilder();
        if(x>0){
            answer.append(repeat("E",x));
             if(y>0)
                answer.append(repeat("N",y));
            else if(y<0)
                answer.append(repeat("S",-y));

        }
        else if(x<0){
            if(y>0)
                answer.append(repeat("N",y));
            else if(y<0)
                answer.append(repeat("S",-y));
            answer.append(repeat("W",-x));
        }
        else{
             if(y>0)
                answer.append(repeat("N",y));
            else if(y<0)
                answer.append(repeat("S",-y));
        }
        
        return answer.toString();
    }

    private static String repeat(String x, int n){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++){
            str.append(x);
        }
        return str.toString();
    }
}
