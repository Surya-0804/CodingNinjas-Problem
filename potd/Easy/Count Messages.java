import java.util.* ;
import java.io.*; 

public class Solution {
    private static HashMap<String,int[]> map=new HashMap<>();
    public static void receiveMessage(String user, int time){
    	// Write your code here
        if(!map.containsKey(user)){
            int[] arr=new int[3001];
            arr[time]++;
            map.put(user,arr);
        }else{
            map.get(user)[time]++;
        }
    }

 	public static ArrayList<Integer> getMessageCount(int l, int r, String user, int k){
    	// Write your code here
        ArrayList<Integer> result=new ArrayList<>();
        int arr[]=map.get(user);
        while(l<=r){
            int sum=0;
            int end=Math.min(l+k-1,r);
            for(int i=l; i<=end; i++){
                sum+=arr[i];
            }
            result.add(sum);
            l+=k;
        }
        return result;
    }
       
}
