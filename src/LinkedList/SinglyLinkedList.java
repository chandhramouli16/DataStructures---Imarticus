//Linked list operations : Traverse, Insert and Delete

package LinkedList;

public class SinglyLinkedList {
	class Node{
		
		int data;
		Node next;
		
		public Node(int data) { //Constructor
			this.data=data;
			next=null;
		}
		
	}
	public Node head=null;
	public Node tail=null;
	
	public void insertAtBeginning(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void addNode(int data) {
		Node newNode= new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			tail=newNode;
		}
	}	
	
	public void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		tail.next=newNode;
		tail=newNode;
	}
	
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("Nodes of SinglyLinkedList : ");
			while(current!=null) {
				System.out.println(current.data);
				current=current.next;
			}
		}
		System.out.println("Node Completed");

	}

	public static void main(String[] args) {

		SinglyLinkedList sl=new SinglyLinkedList();
		
		sl.addNode(1);
		sl.addNode(2);
		sl.insertAtBeginning(4);
		sl.addNode(3);
		sl.insertAtEnd(5);
		sl.addNode(4);
		
		sl.display();
		
	}

}
