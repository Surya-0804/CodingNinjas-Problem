import java.util.* ;
import java.io.*; 

public class Solution {

    static class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minstack;
        // Constructor
        MinStack() {
            // Write your code here.
            stack=new Stack<>();
            minstack=new Stack<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            stack.push(num);
            if(minstack.isEmpty() || minstack.peek()>=num){
                minstack.push(num);
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
            // Write your code here.
            if(stack.isEmpty())
                return -1;
            int popped=stack.pop();
            if(popped==minstack.peek())
                minstack.pop();
            return popped;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            // Write your code here.
            if(stack.isEmpty())
                return -1;
            return stack.peek();
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            // Write your code here.
            if(minstack.isEmpty())
                return -1;
            return minstack.peek();
        }
    }
}
