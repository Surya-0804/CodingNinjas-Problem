import java.util.* ;
import java.io.*; 

public class Solution {

    public static int rounds(int a,int b) {
        //Write your code here
        int ans = 0;

    

    for (int i = b + 1; i <= a; i++){

        int x = i, cnt = 0;       

        for (int j = 2; j * j <= x; j++) {

            while (x % j == 0){

                x /= j;            

                cnt++;

            }   

        }       

        

        if (x > 1)

                cnt++;      

                ans += cnt;    

        }   

            return ans; 
    }
}
