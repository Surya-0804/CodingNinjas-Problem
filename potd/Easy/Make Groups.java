import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findTwoGroups(int n) {
		// Write your code here.	
		int sum=n*(n+1)/2;
		int group1sum=sum/2;
		ArrayList<Integer> group1=new ArrayList<>();
		ArrayList<Integer> group2=new ArrayList<>();
		for(int i=n;i>0;i--){
			if(group1sum-i>=0){
				group1sum-=i;
				group1.add(i);
			}
			else{
				group2.add(i);
			}
		}
		int a=0,b=0;
		for(int x: group1){
			a+=x;
		}
		for(int x: group2){
			b+=x;
		}
		return Math.abs(a-b);
	}
}

