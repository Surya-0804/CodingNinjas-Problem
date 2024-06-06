import java.util.HashMap;
import java.util.Map;

public class Solution{
    public static int missingNumber(int n, int []arr){
        // Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()%2 == 1)
                return entry.getKey();
        }
        return -1;
    }
}
