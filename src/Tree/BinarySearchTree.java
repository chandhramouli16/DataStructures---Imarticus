package Tree;

public class BinarySearchTree {

	class Node{
		int key;
		Node left,right;
		
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	
	Node root;
	
	BinarySearchTree(){
		root=null;
	}
	
	void insert(int key) {
		root=insertKey(root,key);
	}
	
	//Insert key in the tree
	Node insertKey(Node root,int key) {
		//Return a new node if the tree is empty
		if(root==null) {
			root=new Node(key);
			return root;
		}
		
		//Traverse to the right place and insert the node
		if(key<root.key)
			root.left=insertKey(root.left,key);
		else
			root.right=insertKey(root.right,key);
		
		return root;
		
	}
	
	void inOrder() {
		inOrderRec(root);
	}
	
	//In-order traversal
	void inOrderRec(Node root) {
		if(root!=null) {
			inOrderRec(root.left);
			System.out.print(root.key+"->");
			inOrderRec(root.right);
		}
	}
	
	void deleteKey(int key) {
		root=deleteRec(root,key);
	}
	
	Node deleteRec(Node root,int key) {
		//Return if the tree is empty
		if(root==null)
			return root;
		
		//Find the node to be deleted
		if(key<root.key)
			root.left=deleteRec(root.left,key);
		else if(key>root.key)
			root.right=deleteRec(root.right,key);
		else {
			//If the node is with only one child or no child
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			
			//If the node has two children
			//Place the in-order successor in position of the node to be deleted
			root.key=minValue(root.right);
			
			//Delete the in-order successor
			root.right=deleteRec(root.right,root.key);
		}
		return root;
	}
	
	//Find the in-order successor
	int minValue(Node root) {
		int minV=root.key;
		while(root.left!=null) {
			minV=root.left.key;
			root=root.left;
		}
		return minV;
	}
	
	boolean search(int key) {
		return searchNode(root,key);
	}
	
	boolean searchNode(Node root,int search) {
		if(root==null)
			return false;
		else if(root.key==search)
			return true;
		else if(search<root.key)
			return searchNode(root.left,search);
		else if(search>root.key)
			return searchNode(root.right,search);
		return false;
	}
	
	//Driver program to test above functions
	public static void main(String[] args) {

		BinarySearchTree tree=new BinarySearchTree();
		
		tree.insert(8);
		tree.insert(3);
		tree.insert(1);
		tree.insert(6);
		tree.insert(7);
		tree.insert(10);
		tree.insert(14);
		tree.insert(4);
		
		System.out.print("InOrder traversal : ");
		tree.inOrder();
		
		System.out.print("\n\nAfter deleting 10 : ");
		tree.deleteKey(10);
		
		System.out.print("\n\nInOrder traversal : ");
		tree.inOrder();
		
		if(tree.search(4))
			System.out.println("\n\nElement is present");
		else
			System.out.println("\n\nElement is not present");
		
	}

}
