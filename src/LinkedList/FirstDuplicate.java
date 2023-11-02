package LinkedList;

import java.util.*;

public class FirstDuplicate {

	//A Linked List Node
	static class Node{
		int data;
		Node next;
	};
	
	static Node headRef;
	
	static void append(int new_data) {
		Node newNode=new Node();
		Node last=headRef;
		newNode.data=new_data;
		newNode.next=null;
		
		if(headRef==null) {
			headRef=newNode;
			return;
		}
		while(last.next!=null)
			last=last.next;
		
		last.next=newNode;
		return;
	}
	
	static int getFirstDuplicate(Node node) {
		//Unordered map to store the frequency of elements
		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
		Node head=node;
		
		//Update frequency of all the elements
		while(node!=null) {
			if(mp.containsKey(node.data))
				mp.put(node.data,mp.get(node.data)+1);
			else
				mp.put(node.data,1);
			
			node=node.next;
		}
		node=head;
		
		//The first node from the left which appears more than once is the answer
		while(node!=null) {
			if(mp.get(node.data)>1)
				return node.data;
			node=node.next;
		}
		
		//All the nodes are unique
		return -1;
	}
	
	public static void main(String[] args) {

		headRef=null;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of nodes : ");
		int n=scn.nextInt();
		
		System.out.println("Enter elements of the nodes one by one : ");
		for(int i=0;i<n;i++) {
			append(scn.nextInt());
		}
		
		int addr=getFirstDuplicate(headRef);
		
		if(addr==-1)
			System.out.println("No duplicate elements in the list");
		else
			System.out.println("Duplicate element is : "+addr);
		
		scn.close();
	}

}
