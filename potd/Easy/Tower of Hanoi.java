import java.util.ArrayList;

public class Solution 
{
    public static ArrayList < ArrayList<Integer>> towerOfHanoi(int n) 
    {
        //    Write your code here.
        ArrayList < ArrayList<Integer>> moves=new ArrayList<>();
        solveHanoi(n, 1,3,2,moves);
        return moves;
    }
    private static void solveHanoi(int n, int source, int des, int aux, ArrayList<ArrayList<Integer>> moves){
        if(n==0)
            return;
        solveHanoi(n-1, source, aux, des, moves);

        ArrayList<Integer> move=new ArrayList<>();
        move.add(source);
        move.add(des);
        moves.add(move);

        solveHanoi(n-1, aux, des, source, moves);
    }
}
