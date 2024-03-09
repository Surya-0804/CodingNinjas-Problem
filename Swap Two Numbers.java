public class Solution{
    public static void swapNumber(int []a, int []b) {
        // Write your code here.
        for(int i=0;i<a.length;i++){
            int temp=a[i];
            a[i]=b[i];
            b[i]=temp;
        }
    }
}
