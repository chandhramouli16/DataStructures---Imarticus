package LinkedList;

public class IntersectionNodes {

	//A Linked List Node
	static class Node{
		int data;
		Node next;
	}
	
	//Utility function to create a new node with the given data and
	//pushes it onto the list front
	public static Node push(Node head,int data) { //Add front
		//create a new linked list node from the heap
		Node node=new Node();
		node.data=data;
		node.next=head;
		return node;
	}
	
	//Function to find the intersection of two linked lists
	private static Node intersectionPoint(Node list1, Node list2) {
		Node firstTemp=list1;
		while(firstTemp!=null) {
			Node temp=list2;
			while(temp!=null) {
				//If both linked lists points to the same node
				if(firstTemp==temp) {
					return firstTemp;
				}
				temp=temp.next;
			}
			firstTemp=firstTemp.next;
		}
		//If there is no intersecting node
		return null;
	}
	
	public static void main(String[] args) {

		//Construct the first linked list (1 -> 2 -> 3 -> 4 -> 5 -> null)
		Node first=null;
		for(int i=7;i>0;i--) {
			first=push(first,i);
		}
		
		//Construct the second linked list (1 -> 2 -> 3 -> null)
		Node second=null;
		for(int i=3;i>0;i--) {
			second=push(second,i);
		}
		//Link tail of the second list to the fourth node of the first list
		second.next.next.next=first.next.next.next;
		Node addr=intersectionPoint(first,second);
		if(addr!=null) {
			System.out.println("The intersection point is "+addr.data);
		}
		else {
		System.out.println("The list does not intersect");
		}
		
	}

}
