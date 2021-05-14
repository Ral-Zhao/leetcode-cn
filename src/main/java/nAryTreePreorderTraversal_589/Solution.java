package nAryTreePreorderTraversal_589;

import common.Node;

import java.util.*;

/**
 * 给定一个 N 叉树，返回其节点值的 前序遍历 。
 * <p>
 * N 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 * <p>
 *  
 * <p>
 * 进阶：
 * <p>
 * 递归法很简单，你可以使用迭代法完成此题吗?
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：[1,3,5,6,2,4]
 * 示例 2：
 * <p>
 * <p>
 * 输入：root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
 * 输出：[1,2,3,6,7,11,14,4,8,12,5,9,13,10]
 *  
 * <p>
 * 提示：
 * <p>
 * N 叉树的高度小于或等于 1000
 * 节点总数在范围 [0, 10^4] 内
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-ary-tree-preorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<Node> stack = new Stack<>();
        Stack<Integer> child = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                result.add(root.val);
                if (root.children == null || root.children.size() == 0) {
                    break;
                }
                stack.push(root);
                child.push(0);
                root = root.children.get(0);
            }
            while (!stack.isEmpty() && child.peek() >= stack.peek().children.size() - 1) {
                stack.pop();
                child.pop();
            }
            if (stack.isEmpty()) {
                break;
            }
            root = stack.peek().children.get(child.peek() + 1);
            child.push(child.pop() + 1);

        }
        return result;
    }
}
