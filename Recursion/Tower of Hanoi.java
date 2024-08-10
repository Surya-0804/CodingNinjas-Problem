import java.util.ArrayList;

public class Solution 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int src=1;
        int aux=2;
        int dest=3;
        solve(n,ans,src,aux,dest);
        return ans;
    }
    private static void solve(int n, ArrayList<ArrayList<Integer>>ans, int src, int aux, int dest){
        if(n==0)
            return;
        solve(n-1,ans,src,dest,aux);
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(src);
        temp.add(aux);
        ans.add(temp);
        solve(n-1, ans , dest, aux, src);
    }
}
