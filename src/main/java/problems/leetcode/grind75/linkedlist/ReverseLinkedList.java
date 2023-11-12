package problems.leetcode.grind75.linkedlist;

import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<Integer> values = new Stack<>();

        while (head != null) {
            values.push(head.val);
            head = head.next;
        }

        head = new ListNode();
        ListNode current = head;
        while (!values.isEmpty()) {
            current.next = new ListNode(values.pop());
            current = current.next;
        }

        return head.next;
    }
}
