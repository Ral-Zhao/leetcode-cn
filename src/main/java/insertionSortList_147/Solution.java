package insertionSortList_147;

import common.ListNode;

/**
 * 对链表进行插入排序。
 * <p>
 * <p>
 * 插入排序的动画演示如上。从第一个元素开始，该链表可以被认为已经部分排序（用黑色表示）。
 * 每次迭代时，从输入数据中移除一个元素（用红色表示），并原地将其插入到已排好序的链表中。
 * <p>
 *  
 * <p>
 * 插入排序算法：
 * <p>
 * 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
 * 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
 * 重复直到所有输入数据插入完为止。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: 4->2->1->3
 * 输出: 1->2->3->4
 * 示例 2：
 * <p>
 * 输入: -1->5->3->4->0
 * 输出: -1->0->3->4->5
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/insertion-sort-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        ListNode sp = new ListNode();
        sp.next = head;
        ListNode prev;
        while (sp.next != null) {
            head = sp.next;
            prev = sp;
            while (head.next != null) {
                if (head.next.val <= prev.next.val) {
                    prev = head;
                }
                head = head.next;
            }
            ListNode target = prev.next;
            tail.next = target;
            tail = target;
            prev.next = target.next;
            target.next = null;
        }
        return dummy.next;
    }

    public void insertionSort(ListNode result, ListNode head) {
        if (head == null) {
            return;
        }
        ListNode sp = new ListNode();
        sp.next = head;
        ListNode cur = sp;
        ListNode prev = sp;
        while (cur.next != null) {
            if (cur.next.val >= prev.next.val) {
                prev = cur;
            }
            cur = cur.next;
        }
        cur = prev.next;
        prev.next = cur.next;
        cur.next = result.next;
        result.next = cur;
        head = sp.next;
        insertionSort(result, head);
    }


}
