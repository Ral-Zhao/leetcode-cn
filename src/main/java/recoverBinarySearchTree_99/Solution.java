package recoverBinarySearchTree_99;

import common.TreeNode;

/**
 * 给你二叉搜索树的根节点 root ，该树中的两个节点被错误地交换。请在不改变其结构的情况下，恢复这棵树。
 * <p>
 * 进阶：使用 O(n) 空间复杂度的解法很容易实现。你能想出一个只使用常数空间的解决方案吗？
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,3,null,null,2]
 * 输出：[3,1,null,null,2]
 * 解释：3 不能是 1 左孩子，因为 3 > 1 。交换 1 和 3 使二叉搜索树有效。
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [3,1,4,null,null,2]
 * 输出：[2,1,4,null,null,3]
 * 解释：2 不能在 3 的右子树中，因为 2 < 3 。交换 2 和 3 使二叉搜索树有效。
 *  
 * <p>
 * 提示：
 * <p>
 * 树上节点的数目在范围 [2, 1000] 内
 * -2^31 <= Node.val <= 2^31 - 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/recover-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    private TreeNode prev;

    public void recoverTree(TreeNode root) {
        prev = null;
        TreeNode[] arr = new TreeNode[2];
        helper(arr, root);
        int temp = arr[0].val;
        arr[0].val = arr[1].val;
        arr[1].val = temp;
    }

    private void helper(TreeNode[] arr, TreeNode root) {
        if (root == null) {
            return;
        }
        helper(arr, root.left);
        if (prev != null) {
            if (root.val < prev.val) {
                if (arr[0] != null) {
                    arr[1] = root;
                } else {
                    arr[0] = prev;
                    arr[1] = root;
                }
            }
        }
        prev = root;
        helper(arr, root.right);
    }
}
