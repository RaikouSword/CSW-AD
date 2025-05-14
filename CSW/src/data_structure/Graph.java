package data_structure

import java.util.*;

class Graphi<T> {
    private Map<T, List<T>> map = new HashMap<>();

    public void addNewVertex(T s) {
        map.put(s, new LinkedList<T>());
    }

    public void addNewEdge(T source, T destination, boolean bidirectional) {
        if (!map.containsKey(source)) addNewVertex(source);
        if (!map.containsKey(destination)) addNewVertex(destination);
        map.get(source).add(destination);
        if (bidirectional) {
            map.get(destination).add(source);
        }
    }

    public void countVertices() {
        System.out.println("Total number of vertices: " + map.keySet().size());
    }

    public void countEdges(boolean bidirectional) {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }
        if (bidirectional) {
            count = count / 2;
        }
        System.out.println("Total number of edges: " + count);
    }

    public void containsVertex(T s) {
        if (map.containsKey(s)) {
            System.out.println("The graph contains " + s + " as a vertex.");
        } else {
            System.out.println("The graph does not contain " + s + " as a vertex.");
        }
    }

    public boolean containsEdge(T source, T destination) {
        if (map.containsKey(source) && map.get(source).contains(destination)) {
            return true;
        }
        return false;
    }

    public void printGraph() {
        for (T vertex : map.keySet()) {
            System.out.print("Vertex " + vertex + " is connected to: ");
            for (T neighbor : map.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class Graph {
    public static void main(String[] args) {
        Graphi graph = new Graphi();
        graph.addNewEdge(0, 4, true);
        graph.addNewEdge(0, 2, true);
        
        
      
    }
}