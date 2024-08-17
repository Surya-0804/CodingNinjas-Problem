import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> stack) {
		// Write your code here.
		if(!stack.isEmpty()){
			int element=stack.pop();
			sortStack(stack);
			insert(stack,element);
		}
	}
	private static void insert(Stack<Integer> stack, int element){
		if(stack.isEmpty() || stack.peek()<=element){
			stack.push(element);
		}else{
			int temp=stack.pop();
			insert(stack, element);
			stack.push(temp);
		}
	}

}
