import java.util.*;
public class q6 {
	static int isDisconnected(List<List<Integer>> adj) {
		boolean[] visited = new boolean[adj.size()];
		int count=0;
		for (int i = 1; i < adj.size(); i++) {
            if (!visited[i]) {
                BFS(adj, i, visited);
                count++;
            }
            
        }
		return count;
	}
	public static void addEdge(List<List<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	static void BFS(List<List<Integer>> adj, int s, boolean[] visited) {
		Queue<Integer> q= new LinkedList<>();
		visited[s]=true;
		q.add(s);
		while(!q.isEmpty()){
			int curr = q.poll();
			//System.out.print(curr+" ");
			for(int x: adj.get(curr)) {
				if(!visited[x]) {
					visited[x]=true;
					q.add(x);
				}
			}
		}
	}
	public static void main(String[] args) {
		int V = 8;
        List<List<Integer>> adj = new ArrayList<>(V); 
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 1, 2);
//        addEdge(adj, 1, 4);
//        addEdge(adj, 2, 3);
        addEdge(adj, 4, 3);
//        addEdge(adj, 5, 7);
//        addEdge(adj, 5, 6);
//        addEdge(adj, 6, 7);
        addEdge(adj,3,5);
        addEdge(adj,4,5);
        addEdge(adj,6,7);
        addEdge(adj,7,5);
        addEdge(adj,6,2);
        int ans = isDisconnected(adj);
		System.out.println("No of connected components are: "+ans);
	}
}
