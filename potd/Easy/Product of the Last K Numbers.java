import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] solve(int q, int[][] queries) {
        // Write your code here
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> product=new ArrayList<>();
        for(int[] i : queries){
            if(i[0]==0){
                res.add(i[1]);
            }
            else{
                int prod=1;
                for(int k=res.size()-1;k>=res.size()-i[1];k--){
                    prod*=res.get(k);
                }
                product.add(prod);
            }
        }
        int[] result=new int[product.size()];
        for(int i=0;i<product.size();i++){
            result[i]=product.get(i);
        }
        return result;
    }
}
