package LinkedList;

public class CircularLinkedList {
	
	//Represents the node of the list
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
		}
	}
	
	//Declaring head and tail pointer as null
	public Node head=null;
	public Node tail=null;
	
	public void addNodeFront(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	//This function will add the new node at the end of the list
	public void add(int data) {
		//Create new node
		Node newNode=new Node(data);
		//Check if list is empty
		if(head==null) {
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else {
			//Tail will point to new node
			tail.next=newNode;
			//New node will become new tail
			tail=newNode;
			//Since, it is circular linked list tail will point to head
			tail.next=head;
		}
	}
	
	public void addAfter(int data,int item) {
		Node current=head;
		Node newNode=new Node(data);
		if(current==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			return;
		}
		if(current.data==item) {
			newNode.next=current.next;
			current.next=newNode;
			return;
		}
		while(current.data!=item) {
			current=current.next;
		}
		if(current==tail) {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
			return;
		}
		newNode.next=current.next;
		current.next=newNode;
	
	}
	
	public void addNodeLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
		}
		else {
			tail.next=newNode;
			tail=newNode;
			tail.next=head;
		}
	}

	public void deleteNode(int data) {
		Node newNode=new Node(data);
		Node current=head;
		int flag=0;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		do{
			if(current==head&&current.data==data) {
				newNode=head.next;
				tail.next=newNode;
				head=newNode;
				flag=1;
			}
			else if(current.next.data==data) {
				newNode=current.next;
				current.next=newNode.next;
				flag=1;
			}
			current=current.next;
		}while(current!=head);
		if(flag==0) {
			System.out.println("Element not present");
		}
	}
	
	//Displays all the nodes in the list
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			System.out.println("Nodes of the circular linked list : ");
			do {
				System.out.print(current.data+" ");
				current=current.next;
			}while(current!=head);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

		CircularLinkedList cl=new CircularLinkedList();
		
		cl.add(11);
		cl.addNodeFront(10);
		cl.add(12);
		cl.add(13);
		cl.addAfter(14,13);
		cl.add(15);
		cl.addNodeLast(16);
		cl.addAfter(17,16);
		cl.add(18);
		
		cl.deleteNode(18);
		
		cl.display();
		
	}

}
