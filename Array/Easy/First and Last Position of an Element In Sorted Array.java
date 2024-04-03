import java.util.ArrayList;

public class Solution {

    public static int[] firstAndLastPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int[] index=new int[2];
        index[0]=-1;
        for(int i=0;i<n;i++){
            if(arr.get(i)==k){
                index[0]=i;
                break;
            }
        }
        if(index[0]==-1){
            return new int[]{-1,-1};
        }
        for(int i=index[0];i<n;i++){
            if(arr.get(i)!=k){
                index[1]=i-1;
                break;
            }
            if(i==n-1){
                index[1]=i;
            }
        }
        return index;
    }

};
