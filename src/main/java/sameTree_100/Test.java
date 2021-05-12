package sameTree_100;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode p = TreeUtil.buildTree(1, 2, 3);
        TreeNode q = TreeUtil.buildTree(1, 2, 3);
        Assert.assertTrue(solution.isSameTree(p, q));
        p = TreeUtil.buildTree(1, 2);
        q = TreeUtil.buildTree(1, null, 2);
        Assert.assertTrue(!solution.isSameTree(p, q));
        p = TreeUtil.buildTree(1, 2, 1);
        q = TreeUtil.buildTree(1, 1, 2);
        Assert.assertTrue(!solution.isSameTree(p, q));
    }
}
