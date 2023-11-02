package Tree;

import java.util.concurrent.atomic.AtomicInteger;

class Node7{
	int data;
	Node7 left=null,right=null;
	
	Node7(int data){
		this.data=data;
	}
}

public class BTDiameter {

	//Function to find the diameter of the binary tree. Note that the function returns
	//the height of the subtree rooted at a given node, and the diameter is updated within
	//the function as it is passed by reference using the 'AtomicInteger' class
	public static int getDiameter(Node7 root,AtomicInteger diameter) {
		//check emptiness;
		if(root==null) 
			return 0;
		
		//Get heights of left and right subtrees
		int leftHeight=getDiameter(root.left,diameter);
		int rightHeight=getDiameter(root.right,diameter);
		
		//Calculate diameter "through" the current node
		int maxDiameter=leftHeight+rightHeight;
		
		//Update maximum diameter(note that diameter "excluding" the current node in
		//the subtree rooted at the current node is already updated since we are doing
		//post-order traversal
		diameter.set(Math.max(diameter.get(), maxDiameter));
		
		//It is important to return the height of the subtree rooted at the current node
		return Math.max(leftHeight, rightHeight)+1;
	}
	
	public static int getDiameter(Node7 root) {
		AtomicInteger diameter=new AtomicInteger(0);
		getDiameter(root,diameter);
		
		return diameter.get();
	}
	
	public static void main(String[] args) {

		Node7 root=new Node7(1);
		root.left=new Node7(2);
		root.right=new Node7(3);
		root.left.right=new Node7(4);
		root.right.left=new Node7(5);
		root.right.right=new Node7(6);
		root.right.left.left=new Node7(7);
		root.right.left.right=new Node7(8);

		System.out.print("The diameter of the tree is : "+getDiameter(root));
		
	}

}
