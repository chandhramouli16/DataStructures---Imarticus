package Tree;

class Node{
	int item;
	Node leftChild,rightChild;
	
	public Node(int key) {
		item=key;
		leftChild=rightChild=null;
	}
}

public class BinaryTree {
	
	Node root;
	
	BinaryTree(){
		root=null;
	}
	
	//________________________________________________________________________//
	
	//Traversal
	
	void postOrder(Node node) {
		if(node==null)
			return;
		
		//Traverse left
		postOrder(node.leftChild);
		//Traverse right
		postOrder(node.rightChild);
		//Traverse root
		System.out.print(node.item+"->");
	}
	
	void inOrder(Node node) {
		if(node==null)
			return;
		
		//Traverse left
		inOrder(node.leftChild);
		//Traverse root
		System.out.print(node.item+"->");
		//Traverse right
		inOrder(node.rightChild);
	}
	
	void preOrder(Node node) {
		if(node==null)
			return;
		
		//Traverse root
		System.out.print(node.item+"->");
		//Traverse left
		preOrder(node.leftChild);
		//Traverse right
		preOrder(node.rightChild);
	}
	
	//________________________________________________________________________//
	
	public static void main(String[] args) {

		BinaryTree tree=new BinaryTree();
		
		tree.root=new Node(1);
		tree.root.leftChild=new Node(2);
		tree.root.rightChild=new Node(3);
		tree.root.leftChild.leftChild=new Node(4);
		tree.root.leftChild.rightChild=new Node(5);
		tree.root.leftChild.leftChild.leftChild=new Node(6);
		tree.root.leftChild.leftChild.rightChild=new Node(7);
		tree.root.leftChild.rightChild.leftChild=new Node(8);
		tree.root.leftChild.rightChild.rightChild=new Node(9);
		tree.root.rightChild.leftChild=new Node(10);
		tree.root.rightChild.rightChild=new Node(11);
		tree.root.rightChild.rightChild.rightChild=new Node(12);
		
		System.out.println("InOrder traversal : ");
		tree.inOrder(tree.root);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		System.out.println("PreOrder traversal : ");
		tree.preOrder(tree.root);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		System.out.println("PostOrder traversal : ");
		tree.postOrder(tree.root);
		
		System.out.println();
		System.out.println("_________________________________________________");
		
		//________________________________________________________________________//
		
	}

}
