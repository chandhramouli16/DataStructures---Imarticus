package Tree;

import java.util.Scanner;

public class BSTPractice {

	class Node{
		int key;
		Node left,right;
		
		public Node(int item) {
			key=item;
			left=right=null;
		}
	}
	
	static Node root;
	
	BSTPractice(){
		root=null;
	}
	
	Node insert(Node root,int key) {
		if(root==null) {
			root=new Node(key);
			return root;
		}
		
		if(key<root.key)
			root.left=insert(root.left,key);
		else
			root.right=insert(root.right,key);
		
		return root;
	}
	
	void postOrder(Node root) {
		if(root!=null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.key+" ");
		}
	}
	
	void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.key+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
	}

	static void minValue(Node root) {
		int minV=root.key;
		while(root.left!=null) {
			minV=root.left.key;
			root=root.left;
		}
		System.out.println("Minimum value of the Binary Search Tree is : "+minV);
	}
	
	public static void main(String[] args) {

		BSTPractice tree=new BSTPractice();
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Minimum Value of Binary Search Tree Test");
		
		int count=1;
		Functions:
			for(int i=0;i<count;i++) {
				System.out.println("Enter integer element to insert:");
				root=tree.insert(root,scn.nextInt());
				
				System.out.print("Post Order:");
				tree.postOrder(root);
				System.out.println();
				
				System.out.print("Pre Order:");
				tree.preOrder(root);
				System.out.println();
				
				System.out.print("In Order:");
				tree.inOrder(root);
				System.out.println();
				
				System.out.println("Do you want to continue (Type y or n)?");
				char c=scn.next().charAt(0);
				if(c=='y') {
					count++;
					continue Functions;
				}
				else
					minValue(root);
			}
		
		scn.close();
	}

}

