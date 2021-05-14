package secondMinimumNodeInABinaryTree_671;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(2, 2, 5, null, null, 5, 7);
        Assert.assertEquals(5, solution.findSecondMinimumValue(root));
        root = TreeUtil.buildTree(2, 2, 2);
        Assert.assertEquals(-1, solution.findSecondMinimumValue(root));
        root = TreeUtil.buildTree(1, 1, 3, 1, 1, 3, 4, 3, 1, 1, 1, 3, 8, 4, 8, 3, 3, 1, 6, 2, 1);
        Assert.assertEquals(2, solution.findSecondMinimumValue(root));
    }
}
