package partitionList_86;

import common.ListNode;

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * <p>
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目在范围 [0, 200] 内
 * -100 <= Node.val <= 100
 * -200 <= x <= 200
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode part1 = new ListNode();
        ListNode part2 = new ListNode();
        part2.next = head;
        ListNode temp;
        ListNode tail = part1;
        ListNode cur = part2;
        while (cur.next != null) {
            if (cur.next.val < x) {
                temp = cur.next;
                cur.next = temp.next;
                temp.next = null;
                tail.next = temp;
                tail = temp;
            } else {
                cur = cur.next;
            }
        }
        tail.next = part2.next;
        part2.next = null;
        head = part1.next;
        part1.next = null;
        return head;

    }
}
