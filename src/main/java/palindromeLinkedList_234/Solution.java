package palindromeLinkedList_234;

import common.ListNode;

import java.util.Stack;

/**
 * 请判断一个链表是否为回文链表。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 * <p>
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            count++;
            temp = temp.next;
        }
        count = count / 2;
        while (count > 0) {
            if (stack.pop().val != head.val) {
                return false;
            }
            head = head.next;
            count--;
        }
        return true;
    }
}
