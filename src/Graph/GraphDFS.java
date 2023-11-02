package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class GraphDFS {

	int v;  //Number of nodes
	LinkedList<Integer>[] adj; //Adjacency list
	
	@SuppressWarnings("unchecked")
	GraphDFS(int v){
		this.v=v;
		adj=new LinkedList[v]; 
		
		for(int i=0;i<adj.length;i++)
			adj[i]=new LinkedList<Integer>();
	}
	
	void addEdge(int v,int w) {
		adj[v].add(w); //Adding an edge to the adjacency list
	}
	
	void dfs(int n) {
		boolean nodes[]=new boolean[v];
		Stack<Integer> stack=new Stack<>();
		
		stack.push(n);
		int a=0;
		
		while(!stack.empty()) {
			n=stack.peek(); //Extract the top element of the stack
			stack.pop(); //Remove the top element from the stack
			
			if(nodes[n]==false) {
				System.out.print(n+" ");
				nodes[n]=true;
			}
			
			//Iterate through the linked list and then propagate to the next few nodes
			for(int i=0;i<adj[n].size();i++) {
				a=adj[n].get(i);
				//Only push those nodes to the stack which aren't in it already
				if(!nodes[a]) {
					stack.push(a); //Push the top element to the stack
				}
			}
		}
	}
	
	public static void main(String[] args) {

		GraphDFS g=new GraphDFS(6);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 0);
		g.addEdge(1, 3);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		//g.addEdge(4, 3);
		//g.addEdge(5, 3);
		
		System.out.println("Following is the Depth First Traversal");
		g.dfs(0);
		
	}

}
