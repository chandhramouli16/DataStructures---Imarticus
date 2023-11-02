package Graph;

import java.util.Arrays;

public class PrimGraph {

	public void prim(int g[][],int V) {
		int INF=9999999;
		int noEdge;//number of edge
		
		boolean[] selected=new boolean[V];
		
		Arrays.fill(selected,false);
		
		//Set number of edge to 0
		noEdge=0;
		selected[0]=true;
		
		System.out.println("Edge   :  Weight");
		
		while(noEdge<V-1) {
			int min=INF;
			int x=0; //row number
			int y=0; //column number
			
			for(int i=0;i<V;i++) {
				if(selected[i]==true) {
					for(int j=0;j<V;j++) {
						//not in selected and there is an edge
						if(!selected[j]&&g[i][j]!=0) {
							if(min>g[i][j]) {
								min=g[i][j];
								x=i;
								y=j;
							}
						}
					}
				}
			}
			System.out.println(x+" - "+y+"  :  "+g[x][y]);
			selected[y]=true;
			noEdge++;
		}
	}
	
	public static void main(String[] args) {

		PrimGraph G=new PrimGraph();
		
		//Number of vertices
		int V=5;
		
		//Create a 2d array of size 5x5 for adjacency matrix to represent the graph
		int[][] g= {{0,9,75,0,0},
					{9,0,95,19,42},
					{75,95,0,51,66},
					{0,19,51,0,31},
					{0,42,66,31,0}};
		
		G.prim(g, V);
		
	}

}
