import java.util.* ;
import java.io.*; 
import java.util.List;

public class Solution {

    public static int[] linearProbing(List<Integer> keys) {
        // Write your code here.
        int mod=keys.size();
        int[] answer=new int[keys.size()];
        Arrays.fill(answer, -1);
        int j=0;
        for(int num : keys){
            int index=num%mod;
            while(index < mod && answer[index]!=-1){
                index++;
                if(index==mod){
                    index=0;
                }
            }
            answer[index]=num;
            
        }
        return answer;
    }

}
