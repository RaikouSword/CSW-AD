import java.util.*;

public class q10 {	
	static final int v = 4;
    public static int[] dijkstra(int graph[][], int src) {
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        boolean[] fin = new boolean[v];
        for (int count = 0; count < v - 1; count++) {
            int u = -1;
            for (int i = 0; i < v; i++) {
                if (!fin[i] && (u == -1 || dist[u] > dist[i])) {
                    u = i;
                }
            }
            fin[u] = true;
            for (int j = 0; j < v; j++) {
                if (!fin[j] && graph[u][j] != 0) {
                    dist[j] = Math.min(dist[j], dist[u] + graph[u][j]);
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        int graph[][] = {
            {0, 10, 0, 30},
            {10, 0, 50, 0},
            {0, 50, 0, 20},
            {30, 0, 20, 0}
        };
        
        int[] result = dijkstra(graph, 0);
        System.out.println("Shortest distances from source 0:");
        for (int dist : result) {
            System.out.println(dist);
        }
    }
}
