import java.util.*;

public class q11 {
    private int V;
    private List<int[]> edges;

    public q11(int vertices) {
        this.V = vertices;
        edges = new ArrayList<>();
    }
    
    public void addEdge(int u, int v, int weight) {
        edges.add(new int[]{weight, u, v});
    }
    
    public int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        parent[i] = find(parent, parent[i]);
        return parent[i];
    }

    public void union(int[] parent, int[] rank, int x, int y) {
        int xRoot = find(parent, x);
        int yRoot = find(parent, y);

        if (xRoot != yRoot) {
            if (rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
            } else if (rank[xRoot] > rank[yRoot]) {
                parent[yRoot] = xRoot;
            } else {
                parent[yRoot] = xRoot;
                rank[xRoot]++;
            }
        }
    }

    public void primMST() {
        edges.sort(Comparator.comparingInt(edge -> edge[0]));
        int[] parent = new int[V];
        int[] rank = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        int mstCost = 0;
        List<int[]> mstEdges = new ArrayList<>();
        for (int[] edge : edges) {
            int weight = edge[0];
            int u = edge[1];
            int v = edge[2];
            if (find(parent, u) != find(parent, v)) {
                union(parent, rank, u, v);
                mstCost += weight;
                mstEdges.add(new int[]{u, v, weight});
            }
        }
        System.out.println("MST cost: " + mstCost);
        System.out.println("MST edges:");
        for (int[] edge : mstEdges) {
            System.out.println("Edge (" + edge[0] + ", " + edge[1] + ") with weight " + edge[2]);
        }
    }

    public static void main(String[] args) {
        q11 graph = new q11(5);
        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.primMST();
    }
}

