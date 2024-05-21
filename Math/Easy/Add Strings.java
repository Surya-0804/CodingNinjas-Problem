import java.util.* ;
import java.io.*;
import java.math.BigInteger; 

public class Solution {

	public static String stringConcatenation(String num1, String num2) {
		// Write your code here.
		BigInteger a=new BigInteger(num1);
		BigInteger b=new BigInteger(num2);
		BigInteger answer=a.add(b);
		return answer.toString();
		
	}

}
