import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        HashSet<Integer> row=new HashSet<>();
        HashSet<Integer> coloumn=new HashSet<>();

        for(int i=0; i<matrix.length ; i++){
            for(int j=0;  j<matrix[i].length; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    coloumn.add(j);
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(row.contains(i) || coloumn.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        return;
    }

}
