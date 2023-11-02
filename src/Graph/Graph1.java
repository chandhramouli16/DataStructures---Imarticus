package Graph;

public class Graph1 {

	//Inner class to keep track of edges
	class Edges{
		int src,dest;
	}
	
	//Number of vertices and edges
	int vertices,edges;
	
	//Array to store all edges
	Edges[] edge;
	
	Graph1(int vertices,int edges){
		this.vertices=vertices;
		this.edges=edges;
	
		//Initialize the edge array
		edge=new Edges[edges];
		for(int i=0;i<edges;i++) {
			//Each element of the edge array is an object of Edge type
			edge[i]=new Edges();
		}
	}
	
	public static void main(String[] args) {

		//Create an object of graph class
		int noVertices=4;
		int noEdges=6;
		Graph1 g=new Graph1(noVertices, noEdges);
		
		//Create graph;
		/*
		g.edge[0].src=1; //edge 1--2
		g.edge[0].dest=2;
		
		g.edge[1].src=1; //edge 1--3
		g.edge[1].dest=3;
		
		g.edge[2].src=1; //edge 1--4
		g.edge[2].dest=4;
		
		g.edge[3].src=2; //edge 2--4
		g.edge[3].dest=4;
		
		g.edge[4].src=2; //edge 2--5
		g.edge[4].dest=5;
		
		g.edge[5].src=3; //edge 3--4
		g.edge[5].dest=4;
		
		g.edge[6].src=3; //edge 3--5
		g.edge[6].dest=5;
		
		g.edge[7].src=4; //edge 4--5 
		g.edge[7].dest=5;
		*/
		
		g.edge[0].src=1; 
		g.edge[0].dest=2;
		
		g.edge[1].src=1; 
		g.edge[1].dest=3;
		
		g.edge[2].src=1; 
		g.edge[2].dest=4;
	
		g.edge[3].src=2; 
		g.edge[3].dest=3;
		
		g.edge[4].src=2; 
		g.edge[4].dest=4;
		
		g.edge[5].src=3; 
		g.edge[5].dest=4;
		
		//Print graph
		for(int i=0;i<noEdges;i++) {
			System.out.println(g.edge[i].src+"-"+g.edge[i].dest);
		}
		
	}

}
