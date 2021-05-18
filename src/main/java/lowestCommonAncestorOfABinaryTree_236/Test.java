package lowestCommonAncestorOfABinaryTree_236;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode common = null;
        common = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(3, common.val);

        root = TreeUtil.buildTree(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4);
        p = root.left;
        q = root.left.right.right;
        common = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(5, common.val);

        root = TreeUtil.buildTree(1, 2);
        p = root;
        q = root.left;
        common = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(1, common.val);
    }
}
