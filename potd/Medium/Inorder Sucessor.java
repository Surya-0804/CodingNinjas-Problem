import java.util.ArrayList;

/*******************************************************

	Following is the BinaryTreeNode class structure:

	class BinaryTreeNode<T> {
    	T data;
    	BinaryTreeNode<T> left;
    	BinaryTreeNode<T> right;

    	public BinaryTreeNode(T data) {
        	this.data = data;
    	}
	}
	
*******************************************************/

public class Solution {
	public static BinaryTreeNode<Integer> inorderSuccesor(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> node) {
    	// Write you code here.
		ArrayList<BinaryTreeNode> nodes = new ArrayList<>();

		inOrder(root, nodes);

		for (int i = 0; i < nodes.size(); i++) {

			if (nodes.get(i)==node) {

				if ((i+1)<nodes.size()) {

				return nodes.get(i+1);

				}

				break;

			}

		}

		return null;
	}




  	private static void inOrder(BinaryTreeNode<Integer> root, ArrayList<BinaryTreeNode> nodes){

		if (root == null) {

			return;
		}

		inOrder(root.left, nodes);

		nodes.add(root);

		inOrder(root.right, nodes);
	}
}
