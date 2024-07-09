import java.util.Stack;

public class Solution{
    static class Queue {
        // Define the data members(if any) here.
        Stack<Integer> queue;
        Queue() {
            // Initialize your data structure here.
            queue=new Stack<>();
        }

        void enQueue(int val) {
            // Implement the enqueue() function.
            if(queue.isEmpty()){
                queue.push(val);
                return;
            }
            int x = queue.pop();
            enQueue(val);
            queue.push(x);
        }

        int deQueue() {
            // Implement the dequeue() function.
            return queue.isEmpty() ? -1: queue.pop();            
        }

        int peek() {
            // Implement the peek() function here.
            return queue.isEmpty() ? -1:queue.peek();
        }

        boolean isEmpty() {
            // Implement the isEmpty() function here.
            return queue.isEmpty();
        }
    }
}
