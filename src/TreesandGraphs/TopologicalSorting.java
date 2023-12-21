package TreesandGraphs;

import java.util.*;

class TopologicalSorting {
    private int vertices;
    private List<List<Integer>> adjList;

    public TopologicalSorting(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
    }

    public void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                dfs(i, visited, stack);
            }
        }
        System.out.println("Topological Sorting:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    private void dfs(int current, boolean[] visited, Stack<Integer> stack) {
        visited[current] = true;
        for (int x : adjList.get(current)) {
            if (!visited[x]) {
                dfs(x, visited, stack);
            }
        }
        stack.push(current);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertices = sc.nextInt();

        TopologicalSorting ts = new TopologicalSorting(vertices);
        int edges = sc.nextInt();

        for (int i = 0; i < edges; i++) {
            int source = sc.nextInt();                         //vertex number should start from 0
            int destination = sc.nextInt();
            ts.addEdge(source, destination);
        }

        ts.topologicalSort();
    }
}
