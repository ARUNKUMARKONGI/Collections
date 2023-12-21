package TreesandGraphs;

import java.util.ArrayList;
import java.util.Scanner;

class Graph {
    int V;
    ArrayList<ArrayList<Integer>> adj;

    Graph(int V) {
        this.V = V;
        this.adj = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    int countEdges() {
        int sum = 0;
        for (int i = 0; i < V; i++)
        {
            sum += adj.get(i).size();
        }
        return sum / 2;
    }
}

class GraphEdgeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        Graph g = new Graph(V);
        while (true) {
            int src = sc.nextInt();
            if (src == -1) {
                break;
            }
            int dest = sc.nextInt();
            g.addEdge(src, dest);
        }
        sc.close();
        System.out.println("Number of edges: " + g.countEdges());
    }
}