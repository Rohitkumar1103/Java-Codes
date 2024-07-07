public class GPS_Navigation {
     public int[] shortestDistances(int[][] edges, int start, int numNodes) {
          int[] distances = new int[numNodes];
          for (int i = 0; i < numNodes; i++) {
               distances[i] = Integer.MAX_VALUE;
          }
          distances[start] = 0;
          boolean[] visited = new boolean[numNodes];
          for (int i = 0; i < numNodes; i++) {
               int minDistance = Integer.MAX_VALUE;
               int minIndex = -1;
               for (int j = 0; j < numNodes; j++) {
                    if (!visited[j] && distances[j] < minDistance) {
                         minDistance = distances[j];
                         minIndex = j;
                    }
               }
               visited[minIndex] = true;
               for (int[] edge : edges) {
                    if (edge[0] == minIndex) {
                         int newDistance = distances[minIndex] + edge[2];
                         if (newDistance < distances[edge[1]]) {
                              distances[edge[1]] = newDistance;
                         }
                    }
               }
          }
          return distances;
     }
     public static void main(String[] args) {
          int[][] edges = {{0, 1, 4}, {0, 2, 1}, {2, 1, 2}, {1, 3, 1}, {2, 3, 5}};
          int start = 0;
          int numNodes = 4;
          GPS_Navigation solution = new GPS_Navigation();
          int[] distances = solution.shortestDistances(edges, start, numNodes);
          for (int i = 0; i < numNodes; i++) {
               System.out.println("Distance to node " + i + ": " + distances[i]);
          }
     }
}