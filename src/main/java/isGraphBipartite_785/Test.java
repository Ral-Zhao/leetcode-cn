package isGraphBipartite_785;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] graph = new int[][]{{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        Assert.assertTrue(!solution.isBipartite(graph));
        graph = new int[][]{{1,3},{0,2},{1,3},{0,2}};
        Assert.assertTrue(solution.isBipartite(graph));
    }
}
