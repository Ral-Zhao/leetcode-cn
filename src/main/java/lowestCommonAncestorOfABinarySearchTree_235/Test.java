package lowestCommonAncestorOfABinarySearchTree_235;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode common = null;
        common = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(6, common.val);

        root = TreeUtil.buildTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        p = root.left;
        q = root.left.right;
        common = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(2, common.val);

        root = TreeUtil.buildTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        p = root.left.left;
        q = root.left.right.right;
        common = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(2, common.val);

        root = TreeUtil.buildTree(6, 2, 8, 0, 4, 7, 9, null, null, 3, 5);
        p = root.left.right.left;
        q = root.left.right.right;
        common = solution.lowestCommonAncestor(root, p, q);
        Assert.assertEquals(4, common.val);
    }
}
