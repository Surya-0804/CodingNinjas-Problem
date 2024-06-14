import java.util.* ;
import java.io.*; 
/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

class Solution {

  public static Node modularNode(int k,Node head) {
    // Write your code here.
    Node temp=head;
    int position=1;
    Node answer=null;
    while(temp !=null){
      if(position%k == 0){
        answer=temp;
      }
      position++;
      temp=temp.next;
    }
    return answer;
  }
}
