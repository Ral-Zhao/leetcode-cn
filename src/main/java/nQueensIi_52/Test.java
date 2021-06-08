package nQueensIi_52;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(2, solution.totalNQueens(4));
        Assert.assertEquals(1, solution.totalNQueens(1));
    }
}
