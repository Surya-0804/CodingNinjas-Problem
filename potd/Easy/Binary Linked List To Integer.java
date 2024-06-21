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

public class Solution {
    public static int binaryToInteger(int n, Node head) {
        // Write your code here.
        StringBuilder sb=new StringBuilder();
        Node temp=head;
        while(temp!=null){
            sb.append(temp.data);
            temp=temp.next;
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
