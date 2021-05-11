package mostFrequentSubtreeSum_508;

import common.TreeNode;
import utils.ArrayUtil;
import utils.TreeUtil;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = TreeUtil.buildTree(5, 2, -3);
        int[] result = solution.findFrequentTreeSum(root);
        ArrayUtil.printArray(result);
        root = TreeUtil.buildTree(5, 2, -5);
        result = solution.findFrequentTreeSum(root);
        ArrayUtil.printArray(result);
    }
}
