import java.util.* ;
import java.io.*; 
class Queue {
	// Stacks to be used in the operations.
	Stack<Integer> stk1, stk2;

	public Queue() {
		// Intialise here.
		stk1=new Stack<>();
		stk2=new Stack<>();
	}

	// Enqueues 'X' into the queue. Returns true after enqueuing.
	public boolean enqueue(int x) {
		// Write your code here.
		stk1.push(x);
		return true;
	}
	/*
	   Dequeues top element from queue. Returns -1 if the queue is empty, 
	   otherwise returns the popped element.
	*/
	public int dequeue() {
		// Write your code here.
		if(stk2.isEmpty()){
			while(!stk1.isEmpty()){
				stk2.push(stk1.pop());
			}
		}
		if(!stk2.isEmpty()){
			return stk2.pop();
		}
		return -1;
	}
};
