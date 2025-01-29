import java.util.ArrayList;
import java.util.List;

public class q9 {
	static int DFS(List<List<Integer>> adj,int V) {
		boolean[] visited = new boolean[V];
		int count=0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFSRec(adj, visited, i);
                count++;
            }
        }
        return count;
	}
	static void DFSRec(List<List<Integer>> adj, boolean[]visited,int s) {
		visited[s]=true;
//		System.out.print(s+" ");
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
        int ans = DFS(adj,V);
        System.out.print("No of connected components are: "+ans);
	}

}
