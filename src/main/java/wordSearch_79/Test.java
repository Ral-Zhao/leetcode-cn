package wordSearch_79;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(solution.exist(board, "ABCCED"));
        board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(solution.exist(board, "SEE"));
        board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(!solution.exist(board, "ABCB"));
        board = new char[][]{{'a', 'b'}, {'c', 'd'}};
        Assert.assertTrue(solution.exist(board, "cdba"));
        board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'E', 'S'}, {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(solution.exist(board, "ABCESEEEFS"));
    }
}
