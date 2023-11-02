package Tree;

//A class to store a binary tree node
class Node6{
	int data;
	Node6 left=null,right=null;
	
	Node6(int data){
		this.data=data;
	}
}

public class TreeMirror {

	//Function to perform pre-order traversal on a given binary tree
	public static void preOrder(Node6 root) {
		if(root==null)
			return;
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//Utility function to swap left subtree with right subtree
	public static void swap(Node6 root) {
		if(root==null)
			return;
		
		Node6 temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	
	//Function to convert a binary tree into its mirror
	static void convertToMirror(Node6 root) {
		//base case : if the tree is empty
		if(root==null)
			return;
		
		//Convert left subtree
		convertToMirror(root.left);
		
		//Convert right subtree
		convertToMirror(root.right);
		
		//Swap left subtree with right subtree
		swap(root);
	}
	
	public static void main(String[] args) {

		/*Construct the following tree
		 *             1
		 *            / \
		 *           /   \
		 *          2     3
		 *         / \   / \
		 *        4   5 6   7
		*/
		
		Node6 root=new Node6(1);
		root.left=new Node6(2);
		root.right=new Node6(3);
		root.left.left=new Node6(4);
		root.left.right=new Node6(5);
		root.right.left=new Node6(6);
		root.right.right=new Node6(7);
		
		convertToMirror(root);
		preOrder(root);
	}

}
