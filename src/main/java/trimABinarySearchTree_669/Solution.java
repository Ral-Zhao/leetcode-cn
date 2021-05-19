package trimABinarySearchTree_669;

import common.TreeNode;

/**
 * 给你二叉搜索树的根节点 root ，同时给定最小边界low 和最大边界 high。通过修剪二叉搜索树，使得所有节点的值在[low, high]中。
 * 修剪树不应该改变保留在树中的元素的相对结构（即，如果没有被移除，原有的父代子代关系都应当保留）。 可以证明，存在唯一的答案。
 * <p>
 * 所以结果应当返回修剪好的二叉搜索树的新的根节点。注意，根节点可能会根据给定的边界发生改变。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [1,0,2], low = 1, high = 2
 * 输出：[1,null,2]
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [3,0,4,null,2,null,null,1], low = 1, high = 3
 * 输出：[3,2,null,1]
 * 示例 3：
 * <p>
 * 输入：root = [1], low = 1, high = 2
 * 输出：[1]
 * 示例 4：
 * <p>
 * 输入：root = [1,null,2], low = 1, high = 3
 * 输出：[1,null,2]
 * 示例 5：
 * <p>
 * 输入：root = [1,null,2], low = 2, high = 4
 * 输出：[2]
 *  
 * <p>
 * 提示：
 * <p>
 * 树中节点数在范围 [1, 10^4] 内
 * 0 <= Node.val <= 10^4
 * 树中每个节点的值都是唯一的
 * 题目数据保证输入是一棵有效的二叉搜索树
 * 0 <= low <= high <= 10^4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/trim-a-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        while (root != null && (root.val < low || root.val > high)) {
            if (root.val < low) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        if (root == null) {
            return null;
        }
        TreeNode parent = root;
        TreeNode node = root;
        while (node != null) {
            parent = node;
            if (node.left == null) {
                node = node.right;
            } else {
                node = node.left;
                if (node.val < low) {
                    while (node != null && node.val < low) {
                        node = node.right;
                    }
                    parent.left = node;
                }
            }
        }
        node = root;
        while (node != null) {
            parent = node;
            if (node.right == null) {
                node = node.left;
            } else {
                node = node.right;
                if (node.val > high) {
                    while (node != null && node.val > high) {
                        node = node.left;
                    }
                    parent.right = node;
                }
            }
        }
        return root;
    }

    public TreeNode trimBST_recur(TreeNode root, int L, int R) {
        if (root == null)
            return root;

        //下面两个if相当于删除不满足要求的节点
        if (root.val < L)
            return trimBST(root.right, L, R);//返回修剪过的右子树。抱有一丝丝期望，希望右子树能够满足要求，因为右子树的值大于当前根节点的值
        if (root.val > R)
            return trimBST(root.left, L, R);//返回修剪过的左子树，抱有一丝丝期望，希望左子树能够满足要求，因为左子树的值小于当前根节点的值

        //处理正常的节点
        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
