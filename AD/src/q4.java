import java.util.*;
public class q4 {
	static void BFS(List<List<Integer>> adj, int s) {
		Queue<Integer> q= new LinkedList<>();
		boolean[] visited = new boolean[adj.size()];
		visited[s]=true;
		q.add(s);
		while(!q.isEmpty()){
			int curr = q.poll();
			System.out.print(curr+" ");
			for(int x: adj.get(curr)) {
				if(!visited[x]) {
					visited[x]=true;
					q.add(x);
				}
			}
		}
	}
	static void addEdge(List<List<Integer>> adj, int u,int v) {
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
        System.out.println("BFS starting from 0:");
        BFS(adj, 0);
	}

}
