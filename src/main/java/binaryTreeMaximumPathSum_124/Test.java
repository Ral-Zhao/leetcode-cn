package binaryTreeMaximumPathSum_124;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 2, 3);
        Assert.assertEquals(6, solution.maxPathSum(root));
        solution = new Solution();
        root = TreeUtil.buildTree(-10, 9, 20, null, null, 15, 7);
        Assert.assertEquals(42, solution.maxPathSum(root));
        solution = new Solution();
        root = TreeUtil.buildTree(-3);
        Assert.assertEquals(-3, solution.maxPathSum(root));
        solution = new Solution();
        root = TreeUtil.buildTree(2, -1);
        Assert.assertEquals(2, solution.maxPathSum(root));
        solution = new Solution();
        root = TreeUtil.buildTree(1, -2, 3);
        Assert.assertEquals(4, solution.maxPathSum(root));
        solution = new Solution();
        root = TreeUtil.buildTree(9, 6, -3, null, null, -6, 2, null, null, 2, null, -6, -6, -6);
        Assert.assertEquals(16, solution.maxPathSum(root));

    }
}
