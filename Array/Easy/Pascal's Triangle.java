import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
				 ArrayList<ArrayList<Long>> answer=new ArrayList<>();
				 for(int i=0;i<n;i++){
					 answer.add(new ArrayList<Long>());
					 for(int j=0;j<=i;j++){
						if(j==0||j==i)
						 	answer.get(i).add((long)1);
						else
							answer.get(i).add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
					 }
				 }
				return answer;
	}
}
