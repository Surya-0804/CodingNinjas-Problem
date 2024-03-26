import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int even=0,odd=0;
		for(char ch:s.toCharArray()){
			int a=Character.getNumericValue(ch);
			if(a%2==0){
				even+=a;
			}
			else{
				odd+=a;
			}
		}
		System.out.print(even+" "+odd);

	}
}
