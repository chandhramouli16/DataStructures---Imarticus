package Tree;

public class PerfectBinaryTree {

	static class Node{
		int key;
		Node left,right;
	}
	
	//Calculate the depth
	static int depth(Node node) {
		int d=0;
		while(node!=null) {
			d++;
			node=node.left;
		}
		return d;
	}
	
	//Check if the tree is perfect binary tree
	static boolean isPerfect(Node root,int d,int level) {
		//Check if the tree is empty
		if(root==null)
			return true;
		
		//If for children
		if(root.left==null&&root.right==null)
			return (d==level+1);
		
		if(root.left==null||root.right==null)
			return false;
		
		return isPerfect(root.left,d,level+1)&&isPerfect(root.right,d,level+1);
	}
	
	//Wrapper function
	static boolean isPerfect(Node root) {
		int d=depth(root);
		return isPerfect(root,d,0);
	}
	
	//Create a new node
	static Node newNode(int k) {
		Node node=new Node();
		node.key=k;
		node.left=null;
		return node;
	}
	
	public static void main(String[] args) {

		Node root=null;
		root=newNode(1);
		root.left=newNode(2);
		root.right=newNode(3);
		root.left.left=newNode(4);
		root.left.right=newNode(5);
		root.right.left=newNode(6);
		root.right.right=newNode(7);
		
		if(isPerfect(root)==true)
			System.out.println("The tree is a perfect binary tree");
		else
			System.out.println("The tree is not a perfect binary tree");
		
	}

}
