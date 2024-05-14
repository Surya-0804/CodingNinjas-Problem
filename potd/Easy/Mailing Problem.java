public class Solution 
{
    public static int timeTakenToMail(String keyboard, String s)
    {
        // Write your code here.
        int preIndex=0;
        int distance=0;
        for(char ch : s.toCharArray()){
            int curIndex=keyboard.indexOf(ch);
            distance+=Math.abs(preIndex-curIndex);
            preIndex=curIndex;
        }
        return distance;
    }
}
