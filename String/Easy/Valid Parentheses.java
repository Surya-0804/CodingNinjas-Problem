import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        // Write your code here.
        Stack<Character> stack=new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '[' || ch=='('){
                stack.push(ch);
            }
            else if(ch == '}' || ch == ')' || ch ==']'){
                if(stack.isEmpty())
                    return false;
                char top=stack.peek();
                if((top=='[' && ch==']' ) || (top == '{' && ch=='}') || (top=='(' && ch==')'))
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
