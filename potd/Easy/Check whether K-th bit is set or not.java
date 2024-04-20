public class Solution {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        String binNum= Integer.toBinaryString(n);
        if(binNum.length()>=k){
            if(binNum.charAt(binNum.length() -k)=='1')
                return true;
        }

        return false;
    }
}
