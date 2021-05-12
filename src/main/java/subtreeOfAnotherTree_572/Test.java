package subtreeOfAnotherTree_572;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 4, 5, 1, 2);
        TreeNode subRoot = TreeUtil.buildTree(4, 1, 2);
        Assert.assertTrue(solution.isSubtree(root, subRoot));
        root = TreeUtil.buildTree(3, 4, 5, 1, 2, null, null, null, null, 0);
        subRoot = TreeUtil.buildTree(4, 1, 2);
        Assert.assertTrue(!solution.isSubtree(root, subRoot));
        root = TreeUtil.buildTree(1, 1);
        subRoot = TreeUtil.buildTree(1);
        Assert.assertTrue(solution.isSubtree(root, subRoot));
        root = TreeUtil.buildTree(3, 4, 5, 1, null, 2);
        subRoot = TreeUtil.buildTree(3, 1, 2);
        Assert.assertTrue(!solution.isSubtree(root, subRoot));

    }
}
