package Tree;

public class BinaryTreeHeight {
	
	//Represent the node of binary tree
	public static class Node{
		int data;
		Node left;
		Node right;
		
		//Assign data to the new node, set left and right children to null
		public Node(int data) {
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	
	//Represent the root of binary tree
	public Node root;
	public BinaryTreeHeight() {
		root=null;
	}

	//findHeight() will determine the maximum height of the binary tree
	public int findHeight(Node temp) {
		//Check whether tree is empty
		if(root==null) {
			System.out.println("Tree is empty");
			return 0;
		}
		else {
			int leftHeight=0,rightHeight=0;
			
			//Calculate the height of the left subtree
			if(temp.left!=null)
				leftHeight=findHeight(temp.left);
			
			//Calculate the height of the right subtree
			if(temp.right!=null)
				rightHeight=findHeight(temp.right);
			
			//Compare height of left subtree and right subtree and store maximum
			//of two in variable max
			int max=(leftHeight>rightHeight)?leftHeight:rightHeight;
			
			//Calculate the total height of tree by adding height of root
			return (max+1);
		}
	}
	
	public static void main(String[] args) {

		BinaryTreeHeight bt=new BinaryTreeHeight();
		
		//Add nodes to the binary tree
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.right=new Node(6);
		bt.root.left.left.left=new Node(7);
		bt.root.left.left.right=new Node(8);
		bt.root.left.left.left.left=new Node(9);
		bt.root.right.right.left=new Node(10);
		bt.root.right.right.left.left=new Node(11);
		bt.root.right.right.left.right=new Node(12);
		
		//Display the maximum height of the given binary tree
		System.out.println("Maximum height of given binary tree : "+bt.findHeight(bt.root));
		
	}

}