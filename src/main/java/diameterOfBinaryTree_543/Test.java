package diameterOfBinaryTree_543;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 2, 3, 4, 5);
        Assert.assertEquals(3, solution.diameterOfBinaryTree(root));
    }
}
