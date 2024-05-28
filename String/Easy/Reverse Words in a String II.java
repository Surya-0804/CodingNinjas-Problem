
public class Solution {
	
	public static String reverseOrderWords(String str) {
        // Write your code here
        String[] arr=str.split(" ");
        String answer="";
        for(int i=arr.length-1; i>0; i--){
            answer+=arr[i]+" ";
        }
        answer+=arr[0];
        return answer;
        
    }

}
