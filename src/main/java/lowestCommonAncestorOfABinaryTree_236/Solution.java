package lowestCommonAncestorOfABinaryTree_236;

import common.TreeNode;

import java.util.Stack;

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * <p>
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大
 * （一个节点也可以是它自己的祖先）。”
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出：3
 * 解释：节点 5 和节点 1 的最近公共祖先是节点 3 。
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * 输出：5
 * 解释：节点 5 和节点 4 的最近公共祖先是节点 5 。因为根据定义最近公共祖先节点可以为节点本身。
 * 示例 3：
 * <p>
 * 输入：root = [1,2], p = 1, q = 2
 * 输出：1
 *  
 * <p>
 * 提示：
 * <p>
 * 树中节点数目在范围 [2, 10^5] 内。
 * -10^9 <= Node.val <= 10^9
 * 所有 Node.val 互不相同 。
 * p != q
 * p 和 q 均存在于给定的二叉树中。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();
        helper(pStack, root, p);
        helper(qStack, root, q);
        if (pStack.size() < qStack.size()) {
            Stack<TreeNode> temp = qStack;
            qStack = pStack;
            pStack = temp;
        }
        int delta = pStack.size() - qStack.size();
        while (delta > 0) {
            delta--;
            pStack.pop();
        }
        while (!pStack.isEmpty() && pStack.peek() != qStack.peek()) {
            pStack.pop();
            qStack.pop();
        }
        return pStack.pop();
    }

    private boolean helper(Stack<TreeNode> stack, TreeNode root, TreeNode target) {
        stack.push(root);
        if (root == target) {
            return false;
        }
        if (root.left != null && !helper(stack, root.left, target)) {
            return false;
        }
        if (root.right != null && !helper(stack, root.right, target)) {
            return false;
        }
        stack.pop();
        return true;
    }
}
