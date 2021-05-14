package kthSmallestElementInABst_230;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 1, 4, null, 2);
        Assert.assertEquals(1, solution.kthSmallest(root, 1));
        root = TreeUtil.buildTree(5, 3, 6, 2, 4, null, null, 1);
        Assert.assertEquals(3, solution.kthSmallest(root, 3));
    }
}
