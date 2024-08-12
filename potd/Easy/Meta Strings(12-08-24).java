import java.util.* ;
import java.io.*; 
public class Solution{
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        int[] index=new int[2];
        int count=0;

        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                if(count>=2){
                    return false;
                }
                index[count]=i;
                count++;
            }
        }

        return count==2 && (str1.charAt(index[0])==str2.charAt(index[1]) && str1.charAt(index[1])==str2.charAt(index[0]));
    }
}
