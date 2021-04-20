package addTwoNumbersIi_445;

import common.ListNode;

import java.util.Stack;

/**
 * 给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * <p>
 *  
 * <p>
 * 进阶：
 * <p>
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 8 -> 0 -> 7
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                stack1.push(l1);
                l1 = l1.next;
            }
            if (l2 != null) {
                stack2.push(l2);
                l2 = l2.next;
            }
        }

        boolean advance = false;
        ListNode cur = null;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int val1 = 0;
            int val2 = 0;
            if (!stack1.isEmpty()){
                val1 = stack1.pop().val;
            }
            if (!stack2.isEmpty()){
                val2 = stack2.pop().val;
            }
            int count = val1 + val2;
            int newVal = (count + (advance ? 1 : 0))% 10;
            ListNode newNode = new ListNode(newVal);
            newNode.next = cur;
            cur = newNode;
            advance = count + (advance ? 1 : 0) >= 10;
        }
        if (advance){
            ListNode newNode = new ListNode(1);
            newNode.next = cur;
            cur = newNode;
        }

        return cur;
    }
}
