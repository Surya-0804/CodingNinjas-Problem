import java.util.Arrays;

public class Solution {

    public static int[] getProductArrayExceptSelf(int[] arr) {
    	//Your code goes here
        int mod=1000000007;
        int[] product =new int[arr.length];
        if(arr.length ==0)
            return product;
        int left=1;
        int right=1;
        for(int i=0; i<arr.length; i++){
            left = (int) (((long)left*arr[i])%mod);
            product[i] = left;
        }
        for(int i=arr.length-1; i>0; i--){
            product[i] = (int) (((long)product[i-1]*right)%mod);
            right = (int)((long)right*arr[i] %mod);
        }
        product[0]=right;
        return product;
    }

}
