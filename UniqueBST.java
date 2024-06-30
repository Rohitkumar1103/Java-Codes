public class UniqueBST{
    public int numTrees(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1; 
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        UniqueBST solution = new UniqueBST();

        System.out.println("Number of unique BSTs with 3 nodes: " + solution.numTrees(3));
        System.out.println("Number of unique BSTs with 4 nodes: " + solution.numTrees(4));
        System.out.println("Number of unique BSTs with 5 nodes: " + solution.numTrees(5));
    }
}
