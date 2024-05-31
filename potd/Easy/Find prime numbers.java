import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> primeNumbersTillN(int N) 
	{ 
	 	// Write your code here
		ArrayList<Integer> answer=new ArrayList<>();
		if(N< 2){
			return answer;
		}
		boolean isPrime[]=new boolean[N+1];

		for(int i=2 ; i<=N ; i++){
			isPrime[i]=true;
		}

		for(int i=2; i*i<=N; i++){
			if(isPrime[i]){
				for(int j=i*i; j<=N ;j+=i){
					isPrime[j]=false;
				}
			}
		}
		for(int i=2; i<=N ; i++){
			if(isPrime[i]){
				answer.add(i);
			}
		}
		return answer;
	}
}
