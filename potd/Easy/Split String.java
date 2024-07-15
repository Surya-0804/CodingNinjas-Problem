import java.util.* ;
import java.io.*; 
public class Solution {

    private static boolean isVowel(char ch){

        if(ch =='a' || ch=='A' || ch == 'e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
            return true;
        return false;
    }
    public static Boolean splitString(String str) {
        // Write your code here..
        char[] letter=str.toCharArray();
        int mid=letter.length/2;
        int countFirstHalf=0;
        int countSecondHalf=0;

        for(int i=0; i<mid; i++){
            if(isVowel(letter[i]))
                countFirstHalf++;
            if(isVowel(letter[i+mid]))
                countSecondHalf++;
        }
        return countFirstHalf==countSecondHalf;

    }

}
