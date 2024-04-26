import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		int sum=0;
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			sum+=sc.nextInt();

		}
		System.out.print(sum);
	}

}
