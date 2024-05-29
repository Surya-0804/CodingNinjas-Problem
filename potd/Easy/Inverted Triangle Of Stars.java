import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
	public static ArrayList<String> Triangle(int n)
    {
        //    Write your code here.
        ArrayList<String> answer=new ArrayList<>();
        for(int i=0; i<n; i++){
            int star=2*(n-i)-1;
            String str= repeat(' ',i) +repeat('*',star);
            answer.add(str);
        }
        return answer;
    }
    private static String repeat(char ch , int times){
        StringBuilder sb=new StringBuilder(times);
        for(int i=0; i<times ; i++){
            sb.append(ch);
        }
        return sb.toString();
    }
}
