package utils;

import common.ListNode;

public class ListNodeUtil {
    public static void printNode(ListNode listNode) {
        if (listNode == null) {
            System.out.println("null");
            return;
        }
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode buildList(int... vals) {
        ListNode result = null;
        ListNode cur = null;
        for (int i = 0; i < vals.length; i++) {
            ListNode temp = new ListNode(vals[i]);
            if (i == 0) {
                result = temp;
                cur = temp;
            } else {
                cur.next = temp;
                cur = temp;
            }
        }
        return result;
    }
}
