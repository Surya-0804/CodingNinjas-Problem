import java.util.* ;
import java.io.*; 
public class Solution
{
    public static void setMatrixOnes(ArrayList<ArrayList<Integer>> MAT, int n, int m)
    {
        // Write your code here.
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> column=new HashSet<>();

        for(int i=0; i<n ; i++){
            for(int j=0; j<m ; j++){
                if(MAT.get(i).get(j)==1){
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i=0; i<n ; i++){
            for(int j=0; j<m ; j++){
                if(row.contains(i) || column.contains(j)){
                    MAT.get(i).set(j,1);
                }
            }
        }
    }
}
