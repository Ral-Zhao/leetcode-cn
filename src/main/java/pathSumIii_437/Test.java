package pathSumIii_437;

import common.TreeNode;
import org.junit.Assert;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(10, 5, -3, 3, 2, null, 11, 3, -2, null, 1);
        Assert.assertEquals(3, solution.pathSum(root, 8));
        root = TreeUtil.buildTree(1, -2, -3, 1, 3, -2, null, -1);
        Assert.assertEquals(4, solution.pathSum(root, -1));
    }
}
