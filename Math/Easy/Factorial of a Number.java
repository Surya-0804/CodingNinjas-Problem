import java.util.*;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long fact=1;
		if(n>=0){
			for(int i=1;i<=n;i++){
				fact*=i;
			}
			System.out.print(fact);
		}
		else{
			System.out.println("Error");
			
		}
	}
}
