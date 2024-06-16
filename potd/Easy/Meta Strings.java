import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        int len1=str1.length();
        int len2=str2.length();
        if(len1!=len2)
            return false;
        
        if(str1.equals(str2)){
            return false;
        }
        List<Integer> diff=new ArrayList<>();

        for(int i=0; i<len1; i++){
            if(str1.charAt(i) != str2.charAt(i)){
                diff.add(i);
            }
            if(diff.size()>2)
                return false;
        }
        if(diff.size()!=2)
            return false;
        int i=diff.get(0);
        int j=diff.get(1);
        return str1.charAt(i)==str2.charAt(j) && str1.charAt(j)==str2.charAt(i);
    }
}
