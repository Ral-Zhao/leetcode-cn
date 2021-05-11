package sumRootToLeafNumbers_129;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(1, 2, 3);
        Assert.assertEquals(25, solution.sumNumbers(root));
        solution = new Solution();
        root = TreeUtil.buildTree(4, 9, 0, 5, 1);
        Assert.assertEquals(1026, solution.sumNumbers(root));

    }
}
