import java.util.ArrayList;
import java.util.PriorityQueue;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		ArrayList<Integer>answer=new ArrayList<>();
		answer.add(maxHeap(arr, k));
		answer.add(minHeap(arr,k));
		return answer;
	}
	private static int maxHeap(ArrayList<Integer> arr , int k){
		PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
		for(int num : arr){
			pq.offer(num);
			if(pq.size() >k){
				pq.poll();
			}
		
		}
		return pq.peek();
	}
	private static int minHeap(ArrayList<Integer> arr, int k){
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		for(int num : arr){
			pq.offer(num);
			if(pq.size() >k){
				pq.poll();
			}
		
		}
		return pq.peek();
	}
}
