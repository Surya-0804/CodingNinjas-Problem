import java.util.* ;
import java.io.*; 
public class Solution {
    public static void sortArray(ArrayList<Integer> arr, int n) {
        // Write your code here.
        int[] count=new int[3];
        for(int num:arr){
            count[num]++;
        }
        int index=0;
        for(int i=0; i<3; i++){
            for(int j=0; j<count[i]; j++){
                arr.set(index,i);
                index++;
            }
        }
    }
}
