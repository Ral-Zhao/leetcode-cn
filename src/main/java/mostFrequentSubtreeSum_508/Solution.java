package mostFrequentSubtreeSum_508;

import common.TreeNode;

import java.util.*;

/**
 * 给你一个二叉树的根结点，请你找出出现次数最多的子树元素和。
 * 一个结点的「子树元素和」定义为以该结点为根的二叉树上所有结点的元素之和（包括结点本身）。
 * <p>
 * 你需要返回出现次数最多的子树元素和。如果有多个元素出现的次数相同，返回所有出现次数最多的子树元素和（不限顺序）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * 输入:
 * <p>
 * 5
 * /  \
 * 2   -3
 * 返回 [2, -3, 4]，所有的值均只出现一次，以任意顺序返回所有值。
 * <p>
 * 示例 2：
 * 输入：
 * <p>
 * 5
 * /  \
 * 2   -5
 * 返回 [2]，只有 2 出现两次，-5 只出现 1 次。
 * <p>
 *  
 * <p>
 * 提示： 假设任意子树元素和均可以用 32 位有符号整数表示。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/most-frequent-subtree-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    private int max = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        sum(map, root);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           if (entry.getValue()==max){
               list.add(entry.getKey());
           }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private int sum(Map<Integer, Integer> map, TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            int num = map.getOrDefault(node.val, 0) + 1;
            max = Math.max(max, num);
            map.put(node.val, num);
            return node.val;
        }
        int sum = sum(map, node.left) + sum(map, node.right) + node.val;
        int num = map.getOrDefault(sum, 0) + 1;
        max = Math.max(max, num);
        map.put(sum, num);
        return sum;
    }
}
