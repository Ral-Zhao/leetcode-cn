package symmetricTree_101;

import common.TreeNode;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *  
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *  
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *  
 *
 * 进阶：
 *
 * 你可以运用递归和迭代两种方法解决这个问题吗？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/symmetric-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root==null){
            return true;
        }
        return isSym(root.left,root.right);
    }
    private boolean isSym(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null){
            return true;
        }
        if (root1==null){
            return false;
        }
        if (root2==null){
            return false;
        }
        if (root1.val==root2.val){
            return isSym(root1.left,root2.right)&&isSym(root1.right, root2.left);
        }
        return false;
    }
}
