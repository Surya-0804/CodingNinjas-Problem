
public class Solution {
	
	public static String reverseOrderWords(String str) {
        // Write your code here
        String[] words=str.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1; i>=0; i--){
            if(i==0){
                sb.append(words[i]);
            }else{
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
        
    }

}
