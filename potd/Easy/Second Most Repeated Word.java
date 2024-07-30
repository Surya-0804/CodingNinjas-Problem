import java.util.* ;
import java.io.*; 
public class Solution {

    public static String second_repeat(String[] arr, int n) {
        
        // Write your Code here
        HashMap<String,Integer> map=new HashMap<>();
        for(String s: arr){
            map.put(s,map.getOrDefault(s, 0)+1);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b)->b.getValue().compareTo(a.getValue()));
        if(list.size()>1)
            return list.get(1).getKey();
        return "";

    }
}
