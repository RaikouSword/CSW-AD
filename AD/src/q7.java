import java.util.*;
public class q7 {
	static void DFSRec(List<List<Integer>> adj, boolean[]visited,int s) {
		visited[s]=true;
		System.out.print(s+" ");
		for(int x: adj.get(s)) {
			if(!visited[x]) {
				DFSRec(adj,visited,x);
			}
		}
	}
	static void DFS(List<List<Integer> > adj, int s) {
        boolean[] visited = new boolean[adj.size()];
        DFSRec(adj, visited, s);
    }
	public static void addEdge(List<List<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 5;
		List<List<Integer>> adj = new ArrayList<>(V);
		for(int x=0;x<V;x++) {
			adj.add(new ArrayList<>());
		}
		addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);
        int source = 1;
        System.out.print("DFS starting from : "+source + "is: ");
        DFS(adj,source);
	}

}
