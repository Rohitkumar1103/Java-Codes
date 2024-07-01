import java.util.*;

public class GraphConnectivity {
    public boolean isConnected(int n, List<List<Integer>> adjacencyList) {
        if (n == 0) return true;

        boolean[] visited = new boolean[n];
        dfs(0, visited, adjacencyList);

        for (boolean visitStatus : visited) {
            if (!visitStatus) return false;
        }
        return true;
    }

    // Helper function for DFS traversal
    private void dfs(int node, boolean[] visited, List<List<Integer>> adjacencyList) {
        visited[node] = true;
        for (int neighbor : adjacencyList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adjacencyList);
            }
        }
    }

    public static void main(String[] args) {
        GraphConnectivity solution = new GraphConnectivity();

        int n = 5;
        List<List<Integer>> adjacencyList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        adjacencyList.get(0).add(1);
        adjacencyList.get(1).add(0);
        adjacencyList.get(1).add(2);
        adjacencyList.get(2).add(1);
        adjacencyList.get(2).add(3);
        adjacencyList.get(3).add(2);
        adjacencyList.get(3).add(4);
        adjacencyList.get(4).add(3);

        boolean result = solution.isConnected(n, adjacencyList);
        System.out.println("The graph is connected: " + result);
    }
}
