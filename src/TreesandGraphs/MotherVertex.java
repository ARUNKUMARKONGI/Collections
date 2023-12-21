package TreesandGraphs;

import java.util.ArrayList;
import java.util.Scanner;

class MotherVertex {
    private static void addEdge(int u, int v, ArrayList<ArrayList<Integer>> adj) {
        adj.get(u).add(v);
    }

    private static void DFS(ArrayList<ArrayList<Integer>> g, int s, boolean[] visited) {
        visited[s] = true;
        for (int x : g.get(s)) {   //gets the adj list of the source vertex for ex: if 1--> 2,3
            if (!visited[x]) {
                DFS(g, x, visited);        //recursively call from connected vertex to other vertices for ex: 2-->4
            }
        }
    }

    private static int motherVertex(ArrayList<ArrayList<Integer>> g, int V) {
        boolean[] visited = new boolean[V];    //by default initialized to false
        int v = -1;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(g, i, visited);
                v = i;
            }
        }
        boolean[] check = new boolean[V];
        DFS(g, v, check);

        for (boolean index : check) {
            if (!index) {
                return -1;
            }
        }
        return v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of vertices: ");
        int V = scanner.nextInt();

        System.out.print("Enter the number of edges: ");
        int E = scanner.nextInt();

        // Initialize the adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        System.out.println("Enter edges (format: source destination):");
        for (int i = 0; i < E; i++) {
            int source = scanner.nextInt();
            int destination = scanner.nextInt();
            addEdge(source, destination, adj);
        }

        scanner.close();

        System.out.println("A mother vertex is " + motherVertex(adj, V));
    }
}
