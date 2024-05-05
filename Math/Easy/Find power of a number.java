import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		long result=power(x,n);
		System.out.println(result);
	}

	private static long power(int x,int n){
		if(n==0)
			return 1;
		
		
		long temp=power(x,n/2);
		long result=temp*temp;

		if(n%2==1){
			result*=x;

		}

		return result;
	}
}
