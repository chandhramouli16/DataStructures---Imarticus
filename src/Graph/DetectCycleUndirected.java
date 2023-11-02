package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycleUndirected {

	//No. of vertices
	private int V;
	
	///Adjacency list representation
	private LinkedList<Integer> adj[];
	
	@SuppressWarnings("unchecked")
	DetectCycleUndirected(int v){
		V=v;
		adj=new LinkedList[V];
		for(int i=0;i<V;i++)
			adj[i]=new LinkedList<Integer>();
	}
	
	//Function to add an edge into the graph
	void addEdge(int v,int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	
	//A recursive function that uses visited[] and parent to detect cycle in 
	//subgraph reachable from vertex v
	Boolean isCyclicUtil(int v,Boolean visited[],int parent) {
		//Mark the current node as visited
		visited[v]=true;
		Integer i;
		
		//recur for all the vertices adjacent to this vertex
		Iterator<Integer> it=adj[v].iterator();
		while(it.hasNext()) {
			i=it.next();
			
			//If an adjacent is not visited, then recur for that adjacent
			if(!visited[i])
				if(isCyclicUtil(i,visited,v))
					return true;
			
			//If an adjacent is visited and not parent of current vertex,then there is a cycle
			else if(i!=parent)
				return true;
		}
		
		return false;
	}
	
	//Boolean true if the graph contains a cycle, else false
	Boolean isCyclic() {
		//Mark all the vertices as not visited and not part of recursion stack
		Boolean visited[]=new Boolean[V];
		for(int i=0;i<V;i++)
			visited[i]=false;
		
		//Call the recursive helper function to detect cycle in different DFS trees
		for(int u=0;u<V;u++) {
			//Don't recur u if already visited
			if(!visited[u])
				if(isCyclicUtil(u,visited,-1))
					return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {

		DetectCycleUndirected graph=new DetectCycleUndirected(5);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(2,1);
		graph.addEdge(0,3);
		graph.addEdge(3,4);
		
		//Function call
		if(graph.isCyclic())
			System.out.println("Graph contains cycle");
		else
			System.out.println("Graph doesn't contain cycle");
		
	}

}
