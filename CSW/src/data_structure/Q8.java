package data_structure;

import java.util.*;

class Graph {
    private LinkedList<Integer>[] adj;
    private int v;

    Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int w) {
        if (u >= 0 && u < v && w >= 0 && w < v) {
            adj[u].add(w);
            adj[w].add(u);
        } else {
            throw new IndexOutOfBoundsException("Vertex index out of bounds");
        }
    }

    void printAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < v; i++) {
            System.out.print("Vertex " + i + " -> ");
            for (Integer neighbor : adj[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    void BFS(int start) {
        if (start < 0 || start >= v) {
            System.out.println("Invalid start vertex.");
            return;
        }

        boolean[] visited = new boolean[v];
        ArrayDeque<Integer> q = new ArrayDeque<>();

        visited[start] = true;
        q.offer(start);

        System.out.println("\nBreadth-First Search starting from vertex " + start + ":");

        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (Integer neighbor : adj[curr]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.printAdjList();
        g.BFS(0);
        g.BFS(3);
    }
}