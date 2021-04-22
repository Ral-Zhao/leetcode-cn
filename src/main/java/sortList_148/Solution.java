package sortList_148;

import common.ListNode;

/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 * <p>
 * 进阶：
 * <p>
 * 你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 示例 2：
 * <p>
 * <p>
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 * 示例 3：
 * <p>
 * 输入：head = []
 * 输出：[]
 *  
 * <p>
 * 提示：
 * <p>
 * 链表中节点的数目在范围 [0, 5 * 10^4] 内
 * -10^5 <= Node.val <= 10^5
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode partOne = new ListNode();
        ListNode partTwo = new ListNode();
        ListNode tailOne = partOne;
        ListNode minPrev;
        ListNode sp = new ListNode(-111);
        sp.next = head;
        ListNode maxPrev;
        while (sp.next != null) {
            head = sp;
            minPrev = sp;
            maxPrev = sp;
            while (head.next != null) {
                if (head.next.val <= minPrev.next.val) {
                    minPrev = head;
                }
                if (head.next.val > maxPrev.next.val) {
                    maxPrev = head;
                }
                head = head.next;
            }
            if (minPrev == maxPrev) {
                tailOne.next = minPrev.next;
                minPrev.next.next = null;
                tailOne = tailOne.next;
                break;
            }
            ListNode minTarget = minPrev.next;
            if (minTarget == maxPrev) {
                maxPrev = minPrev;
            }
            tailOne.next = minTarget;
            tailOne = minTarget;
            minPrev.next = minTarget.next;
            minTarget.next = null;

            ListNode maxTarget = maxPrev.next;
            maxPrev.next = maxTarget.next;
            maxTarget.next = partTwo.next;
            partTwo.next = maxTarget;

        }
        tailOne.next = partTwo.next;
        return partOne.next;
    }

    public ListNode sortList_quick(ListNode head) {
        if (head == null || head.next == null) return head;
        // 没有条件，创造条件。自己添加头节点，最后返回时去掉即可。
        ListNode newHead = new ListNode(-1);
        newHead.next = head;
        return quickSort(newHead, null);
    }

    // 带头结点的链表快速排序
    private ListNode quickSort(ListNode head, ListNode end) {
        if (head == end || head.next == end || head.next.next == end) return head;
        // 将小于划分点的值存储在临时链表中
        ListNode tmpHead = new ListNode(-1);
        // partition为划分点，p为链表指针，tp为临时链表指针
        ListNode partition = head.next, p = partition, tp = tmpHead;
        // 将小于划分点的结点放到临时链表中
        while (p.next != end) {
            if (p.next.val < partition.val) {
                tp.next = p.next;
                tp = tp.next;
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        // 合并临时链表和原链表，将原链表接到临时链表后面即可
        tp.next = head.next;
        // 将临时链表插回原链表，注意是插回！（不做这一步在对右半部分处理时就断链了）
        head.next = tmpHead.next;
        quickSort(head, partition);
        quickSort(partition, end);
        // 题目要求不带头节点，返回结果时去除
        return head.next;
    }

}
