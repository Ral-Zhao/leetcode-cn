package addTwoNumbers_2;

import common.ListNode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * <p>
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * <p>
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：l1 = [2,4,3], l2 = [5,6,4]
 * 输出：[7,0,8]
 * 解释：342 + 465 = 807.
 * 示例 2：
 * <p>
 * 输入：l1 = [0], l2 = [0]
 * 输出：[0]
 * 示例 3：
 * <p>
 * 输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * 输出：[8,9,9,9,0,0,0,1]
 *  
 * <p>
 * 提示：
 * <p>
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean advance = false;
        ListNode result = new ListNode();
        ListNode cur = result;
        while (l1 != null || l2 != null) {
            int val1 = 0;
            int val2 = 0;
            if (l1!=null){
                val1 = l1.val;
                l1 = l1.next;
            }
            if (l2!=null){
                val2 = l2.val;
                l2 = l2.next;
            }
            int count = val1 + val2;
            int newVal = (count + (advance ? 1 : 0))% 10;
            ListNode newNode = new ListNode(newVal);
            cur.next = newNode;
            cur = newNode;
            advance = count + (advance ? 1 : 0) >= 10;
        }
        if (advance){
            cur.next = new ListNode(1);
        }

        return result.next;
    }
}
