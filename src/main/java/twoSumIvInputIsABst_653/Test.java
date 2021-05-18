package twoSumIvInputIsABst_653;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(5, 3, 6, 2, 4, null, 7);
        Assert.assertTrue(solution.findTarget(root, 9));
        Assert.assertTrue(!solution.findTarget(root, 28));
    }
}
