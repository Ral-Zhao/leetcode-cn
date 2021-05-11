package binaryTreePaths_257;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        path(result, stack, root);
        return result;
    }

    private void path(List<String> result, Stack<String> stack, TreeNode node) {
        if (node.left == null && node.right == null) {
            List<String> list = new ArrayList<>(stack);
            list.add(node.val + "");
            result.add(String.join("->", list));
            return;
        }
        stack.push(node.val + "");
        if (node.left != null) {
            path(result, stack, node.left);
        }
        if (node.right != null) {
            path(result, stack, node.right);
        }
        stack.pop();
    }
}
