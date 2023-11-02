package Tree;

class Node5{
	int data;
	Node5 left,right;
	Node5(int d){
		data=d;
		left=right=null;
	}
}

//Calculate height
class Height{
	int height=0;
}

public class BTHeightBalance {

	Node5 root;
	public BTHeightBalance() {
		root=null;
	}
	
	//check height balance
	boolean checkHeightBalance(Node5 root, Height height) {
		
		//Check for emptiness
		if(root==null) {
			height.height=0;
			return true;
		}
		
		Height leftHeighteight=new Height();
		Height rightHeighteight=new Height();
		boolean l=checkHeightBalance(root.left,leftHeighteight);
		boolean r=checkHeightBalance(root.right,rightHeighteight);
		int leftHeight=leftHeighteight.height;
		int rightHeight=rightHeighteight.height;
		
		height.height=(leftHeight>rightHeight?leftHeight:rightHeight)+1;
		
		if((leftHeight-rightHeight>=2)||(rightHeight-leftHeight>=2))
			return false;
		else
			return l&&r;
	}
	
	public static void main(String[] args) {

		Height height=new Height();
		BTHeightBalance tree=new BTHeightBalance();
		tree.root=new Node5(1);
		tree.root.left=new Node5(2);
		tree.root.right=new Node5(3);
		tree.root.left.left=new Node5(4);
		tree.root.left.right=new Node5(5);
		
		if(tree.checkHeightBalance(tree.root,height))
			System.out.println("The tree is balanced");
		else
			System.out.println("The tree is not balanced");
	}

}
