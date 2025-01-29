import java.util.*;
public class q8 {
	static void DFS(List<List<Integer>> adj,int V) {
		boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSRec(adj, visited, i);
            }
        }
	}
	static void DFSRec(List<List<Integer>> adj, boolean[]visited,int s) {
		visited[s]=true;
		System.out.print(s+" ");
		for(int x: adj.get(s)) {
			if(!visited[x]) {
				DFSRec(adj,visited,x);
			}
		}
	}
	public static void addEdge(List<List<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 6;
		List<List<Integer>> adj = new ArrayList<>(V);
		for(int x=0;x<V;x++) {
			adj.add(new ArrayList<>());
		}
		addEdge(adj, 1,2);
        addEdge(adj, 2,0);
        addEdge(adj, 0,3);
        addEdge(adj, 4,5);
        System.out.print("DFS starting from is: ");
        DFS(adj,V);
	}

}
