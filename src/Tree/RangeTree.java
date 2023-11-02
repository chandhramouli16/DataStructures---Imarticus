package Tree;

import java.util.Random; 
import java.util.Scanner;

class BSTNodes{
	BSTNodes left,right;
	int data;
	
	public BSTNodes() {
		left=null;
		right=null;
		data=0;
	}
	
	public BSTNodes(int n) {
		left=null;
		right=null;
		data=n;
	}
	
	public void setLeft(BSTNodes n) {
		left=n;
	}
	
	public void setRight(BSTNodes n) {
		right=n;
	}
	
	public BSTNodes getLeft() {
		return left;
	}
	
	public BSTNodes getRight() {
		return right;
	}
	
	public void setData(int d) {
		data=d;
	}
	
	public int getData() {
		return data;
	}
}

public class RangeTree {

	private BSTNodes root;
	
	public RangeTree() {
		root=null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(int data) {
		root=insert(root,data);
	}
	
	private BSTNodes insert(BSTNodes node,int data) {
		if(node==null)
			node=new BSTNodes(data);
		else {
			if(data<=node.getData())
				node.left=insert(node.left,data);
			else
				node.right=insert(node.right,data);
		}
		return node;
	}
	
	public void delete(int k) {
		if(isEmpty())
			System.out.println("Tree empty");
		else if(search(k)==false)
			System.out.println("Sorry"+k+"is not present");
		else {
			root=delete(root,k);
			System.out.println(k+" deleted from the tree");
		}
	}
	
	private BSTNodes delete(BSTNodes root,int k) {
		BSTNodes p,p2,n;
		if(root.getData()==k) {
			BSTNodes lt,rt;
			lt=root.getLeft();
			rt=root.getRight();
			if(lt==null&&rt==null)
				return null;
			else if(lt==null) {
				p=rt;
				return p;
			}
			else if(rt==null) {
				p=lt;
				return p;
			}
			else {
				p2=rt;
				p=rt;
				while(p.getLeft()!=null)
					p=p.getLeft();
				p.setLeft(lt);
				return p2;
			}
		}
		if(k<root.getData()) {
			n=delete(root.getLeft(),k);
			root.setLeft(n);;
		}
		else {
			n=delete(root.getRight(),k);
			root.setRight(n);
		}
		return root;
	}
	
	public int countNodes() {
		return countNodes(root);
	}
	
	private int countNodes(BSTNodes r) {
		if(r==null)
			return 0;
		else {
			int l=1;
			l+=countNodes(r.getLeft());
			l+=countNodes(r.getRight());
			return l;
		}
	}
	
	public boolean search(int val) {
		return search(root,val);
	}
	
	public boolean search(BSTNodes r,int val) {
		boolean found=false;
		while((r!=null)&&!found) {
			int rVal=r.getData();
			if(val<rVal)
				r=r.getLeft();
			else if(val>rVal)
				r=r.getRight();
			else {
				found=true;
				break;
			}
			found=search(r,val);
		}
		return found;
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public void inOrder(BSTNodes r) {
		if(r!=null) {
			inOrder(r.getLeft());
			System.out.print(r.getData()+" ");
			inOrder(r.getRight());
		}
	}
	
	public void preOrder() {
		preOrder(root);
	}
	
	public void preOrder(BSTNodes r) {
		if(r!=null) {
			System.out.print(r.getData()+" ");
			preOrder(r.getLeft());
			preOrder(r.getRight());
		}
	}
	
	public void postOrder() {
		postOrder(root);
	}
	
	public void postOrder(BSTNodes r) {
		if(r!=null) {
			postOrder(r.getLeft());
			postOrder(r.getRight());
			System.out.print(r.getData()+" ");
		}
	}
	
	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		RangeTree bst=new RangeTree();
		System.out.println("Range tree in One Dimensiomnal points (BST)");
		Random random=new Random();
		
		int n=10;
		for(int i=0;i<n;i++)
			bst.insert(Math.abs(random.nextInt(100)));
		
		char ch;
		do {
			System.out.println("Operations : ");
			System.out.println("1. Print Tree");
			System.out.println("2. Delete");
			System.out.println("3. Search");
			System.out.println("4. Count nodes");
			System.out.println("5. Check empty");
			
			int choice=scn.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Post Order : ");
				bst.postOrder();
				System.out.println();
				System.out.println("Pre Order : ");
				bst.preOrder();
				System.out.println();
				System.out.println("In Order : ");
				bst.inOrder();
				break;
			case 2:
				System.out.println("Enter the element to delete : ");
				bst.delete(scn.nextInt());
				break;
			case 3:
				System.out.println("Enter the element to search : ");
				bst.search(scn.nextInt());
				break;
			case 4:
				System.out.println("Nodes =  : "+bst.countNodes());
				break;
			case 5:
				System.out.println("Empty Status =  : "+bst.isEmpty());
				break;
			default:
				System.out.println("Wrong Entry\n");
			}
			System.out.println("\nDo you want to continue (Type y or n)?\n");
			ch=scn.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		scn.close();
	}

}
