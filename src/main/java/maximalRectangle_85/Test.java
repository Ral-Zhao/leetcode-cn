package maximalRectangle_85;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] matrix = new char[][]{{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}};
        Assert.assertEquals(6, solution.maximalRectangle(matrix));
        matrix = new char[][]{};
        Assert.assertEquals(0, solution.maximalRectangle(matrix));
        matrix = new char[][]{{'1'}};
        Assert.assertEquals(1, solution.maximalRectangle(matrix));
        matrix = new char[][]{{'0'}};
        Assert.assertEquals(0, solution.maximalRectangle(matrix));
        matrix = new char[][]{{'0','0'}};
        Assert.assertEquals(0, solution.maximalRectangle(matrix));
        matrix = new char[][]{{'0'},{'1'}};
        Assert.assertEquals(1, solution.maximalRectangle(matrix));
        matrix = new char[][]{
                {'0','0','0','0','0','0','1'},
                {'0','0','0','0','1','1','1'},
                {'1','1','1','1','1','1','1'},
                {'0','0','0','1','1','1','1'}};
        Assert.assertEquals(9, solution.maximalRectangle(matrix));
    }
}
