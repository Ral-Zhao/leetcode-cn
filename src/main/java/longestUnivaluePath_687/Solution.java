package longestUnivaluePath_687;

import common.TreeNode;

/**
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 示例 1:
 *
 * 输入:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * 输出:
 *
 * 2
 * 示例 2:
 *
 * 输入:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * 输出:
 *
 * 2
 * 注意: 给定的二叉树不超过10000个结点。 树的高度不超过1000。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-univalue-path
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int left = getLongest(root.left);
        int right = getLongest(root.right);
        int max = 0;
        if (root.left == null) {
            if (root.right.val == root.val) {
                max = 1 + right;
            }
        } else if (root.right == null) {
            if (root.left.val == root.val) {
                max = 1 + left;
            }
        } else {
            if (root.left.val == root.val) {
                max += 1 + left;
            }
            if (root.right.val == root.val) {
                max += 1 + right;
            }
        }
        return Math.max(max, Math.max(longestUnivaluePath(root.right), longestUnivaluePath(root.left)));
    }

    private int getLongest(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }

        if (root.left == null) {
            if (root.right.val == root.val) {
                return 1 + getLongest(root.right);
            }
            return 0;
        }
        if (root.right == null) {
            if (root.left.val == root.val) {
                return 1 + getLongest(root.left);
            }
            return 0;
        }
        if (root.val == root.left.val && root.val == root.right.val) {
            return 1 + Math.max(getLongest(root.left), getLongest(root.right));
        } else if (root.val == root.left.val) {
            return 1 + getLongest(root.left);
        } else if (root.val == root.right.val) {
            return 1 + getLongest(root.right);
        } else {
            return 0;
        }
    }

    int ans;

    public int longestUnivaluePath_best(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }

    public int arrowLength(TreeNode node) {
        if (node == null) return 0;
        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;
        if (node.left != null && node.left.val == node.val) {
            arrowLeft = left + 1;
        }

        if (node.right != null && node.right.val == node.val) {
            arrowRight = right + 1;
        }

        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);

    }


}
